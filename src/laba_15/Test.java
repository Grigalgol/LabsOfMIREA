package laba_15;

public class Test {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.put("1", "145");
        hashTable.put("2", "1521");
        hashTable.put("3", "43");
        hashTable.put("4", "8553");

        System.out.println("Таблица:");
        System.out.println(hashTable+"\n");

        System.out.println("Вывод элемента со значением ключа 3: "+hashTable.get("3"));
        hashTable.remove("2");
        System.out.println("Вывод таблицы после удаления элемента со значением ключа 2: \n"+hashTable);
    }
}
