package com.kotari;

import com.learning.Employee;

import java.math.BigDecimal;
import java.util.*;

public class CustomerCreator {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Pradeep", "pradeepkumark1@hexaware.com", "1234567890", "123 Main St, City, Country", "1990-01-01");
        Customer customer2 = new Customer("Kiran", "kumark1@hexaware.com", "1234", "456 Main St, City, Country", "1990-01-02");
        System.out.println("Customer1 Name: " + customer1.getName());
        System.out.println("Customer2 Name: " + customer2.getName());
        Employee employee = new Employee(1, "Pradeep", "Kumar", new BigDecimal(100000), 33, new Date());
        System.out.println("Employee Name: " + employee.getFirstName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee Record: " + employee);
        System.out.println("Employee Company Name: " + Employee.COMPANY_NAME);


        Map<Integer, String> customerMap = new HashMap<>();
        customerMap.put(1, "John Doe");
        customerMap.put(2, "Jane Smith");
        customerMap.put(3, "Alice Johnson");
        System.out.println("Customer Map: " + customerMap);

        Map<Customer, List<Customer>> custMap = new HashMap<>(2000);
        custMap.put(customer1, List.of(customer1, customer2));
        System.out.println("Customer List: " + custMap.get(customer1));
        if (customer1.hashCode()!=customer2.hashCode()) {
            System.out.println("Customer1 and Customer2 are not same");
        } else if (customer1.hashCode()==customer2.hashCode()) {
            if(customer1.equals(customer2)){
                System.out.println("Customer1 and Customer2 are same");
            } else {
                System.out.println("Customer1 and Customer2 are not same");
            }
        } else {
            System.out.println("Customer1 and Customer2 are not same");
        }
        // hashCode -> processed hashCode -> index.

        // bucket -> 0,1,2,3,4,5,6,7,8,9

        // initial size 16
        // load factor 0.75

        // 16 * 0.75 = 12
        // doubles in size = 32.

        Map<String, String> map1 = new HashMap<>(16, 0.75f);
        map1.put("key1", "value1");
        map1.put("key2", "value2");
        map1.put("key3", "value3");
        map1.put("key4", "value4");

        String value = map1.get("key1");
        System.out.println("Value for key1: " + value);



        //1000 key value


        System.out.println("Map1: " + map1);

        // 0,1,2,...
        // linked list , Tree Map or a red black tree.

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};

        // dynamic array
        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(5);
        integers.add(3);
        System.out.println("integers: " + integers);
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(1);
        integerSet.add(5);
        integerSet.add(3);
        System.out.println("Set: " + integerSet);



        // faster retrieval, 0(1) -> 1
        // get is faster
        // add is slower.


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0,1);
        linkedList.add(1,2);
        linkedList.add(2,3);
        linkedList.add(3,4);
        linkedList.add(4,5);
        System.out.println("LinkedList before performing any operations: " + linkedList);
        // slower retrieval, 0(1) -> 1
        // get is slower
        // add is faster.
        // remove is faster.

        linkedList.pop();
        linkedList.remove(0);
        linkedList.remove(1);
        linkedList.add(1, 10);
        linkedList.remove();
        System.out.println("LinkedList: " + linkedList);

    }
}
