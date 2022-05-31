package hashTable;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: JoeyShelby
 * @date: 2022-05-30 10:49
 *
 * 有一个公司，当有新的员工来报道时，要求将该员工的信息加入(id,性别，年龄，住址..)，
 * 当输入该员工的id时，要求查找到该员工的所有信息。
 */
public class MyHashTable {
    private final EmployeeList[] hashTable;
    private final Integer maxSize;

    public MyHashTable(Integer maxSize) {
        this.maxSize = maxSize;
        this.hashTable = new EmployeeList[maxSize];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new EmployeeList();
        }
    }

    /**
     * 根据员工 id ，返回 对应的 hash 值
     * @param id
     * @return
     */
    public int hashCode(int id) {
        return id % maxSize;
    }

    /**
     * 向 hashTable 中添加员工
     * @param employee
     */
    public void add(Employee employee) {
        int hashCode = this.hashCode(employee.getId());
        this.hashTable[hashCode].add(employee);
        System.out.println("添加成功");
    }

    public Employee find(int id) {
        int hashCode = this.hashCode(id);
        return hashTable[hashCode].find(id);
    }

    public void list( ) {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("↓=======↓"+i+ "↓======↓");
            hashTable[i].list();
        }
    }

    public void delete(int id) {
        int hashCode = this.hashCode(id);
        hashTable[hashCode].delete(id);
        System.out.println("删除成功");
        this.list();
    }
}


/**
 * 员工链表，用于在 hash 表 中存储员工信息
 */
class EmployeeList{
    private Employee head;

    /**
     * 在链表末端添加员工
     */
    public void add(Employee employee) {
        if(head == null) head = employee;
        else {
            Employee curEmployee = head;
            while(curEmployee.getNext() != null){
                curEmployee = curEmployee.getNext();
            }
            curEmployee.setNext( employee );
        }
    }

    /**
     * 根据 员工id 在链表中查找相应节点
     */
    public Employee find(int id) {
        if(head == null) return new Employee(-1,"无对应员工",-1);
        if (head.getId() == id) return head;
        Employee curEmployee = head.getNext();
        while(curEmployee != null){
            if(curEmployee.getId() == id) return curEmployee;
            curEmployee = curEmployee.getNext();
        }
        return new Employee(-1,"无对应员工",-1);
    }

    /**
     * 打印该链上的所有员工信息
     */
    public void list() {
        if(head == null) return;
        Employee curEmployee = head;
        System.out.println(head);
        while(curEmployee.getNext() != null){
            System.out.println(curEmployee.getNext());
            curEmployee = curEmployee.getNext();
        }
    }

    /**
     * 根据 id 删除一个节点
     * @param id
     */
    public void delete(int id) {
        if(head == null) return;
        Employee curEmployee = head;
        Employee nextEmployee = head.getNext();
        if(head.getId() == id) head = nextEmployee;
        while(curEmployee.getNext() != null) {
            if(nextEmployee.getId() == id) {
                curEmployee.setNext(nextEmployee.getNext());
                return;
            }
            curEmployee = curEmployee.getNext();
            nextEmployee = nextEmployee.getNext();
        }

    }
}

/**
 * 员工类，同时也是哈希表中链表的节点
 */
class Employee{
    private Integer id;
    private String name;
    private Integer age;
    private Employee next;

    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee getNext() {
        return next;
    }

    public void setNext(Employee next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age
                +"}";
    }
}