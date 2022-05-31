package hashTable;

/**
 * @author: JoeyShelby
 * @date: 2022-05-30 14:27
 */
public class TestHash {

    public static void main(String[] args) {
        /*EmployeeList employeeList = new EmployeeList();
        employeeList.add(new Employee(1,"joey1",21));
        employeeList.add(new Employee(2,"joey2",22));
        employeeList.add(new Employee(3,"joey3",23));
        employeeList.add(new Employee(4,"joey4",24));


        System.out.println(employeeList.find(2));*/

        /*初始化一个长度为 7 的 hashTable */
        MyHashTable hashTable = new MyHashTable(7);

        hashTable.add(new Employee(1,"joey1",21));
        hashTable.add(new Employee(2,"joey2",22));
        hashTable.add(new Employee(3,"joey3",23));
        hashTable.add(new Employee(4,"joey4",24));
        hashTable.add(new Employee(5,"joey5",25));
        hashTable.add(new Employee(6,"joey6",26));
        hashTable.add(new Employee(7,"joey7",27));

        hashTable.list();

        hashTable.add(new Employee(11,"joey11",31));
        hashTable.add(new Employee(12,"joey12",32));
        hashTable.add(new Employee(13,"joey13",33));
        hashTable.add(new Employee(14,"joey14",34));
        hashTable.add(new Employee(15,"joey15",35));
        hashTable.add(new Employee(16,"joey16",36));
        hashTable.add(new Employee(17,"joey17",37));

        hashTable.list();

        hashTable.delete(15);
        hashTable.list();

        System.out.println("查找员工：" + hashTable.find(17));
    }
}
