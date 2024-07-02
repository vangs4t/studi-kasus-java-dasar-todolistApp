import java.util.ArrayList;
import java.util.Scanner;

public class TodolistApp {
    public static ArrayList<String> data = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Membuat method untuk menampilkan todolist
     */
    public static void showTodolist(){
        System.out.println("TODOlist");
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) != null){ //disini kita harus membuat kondisi karena jika tidak maka data yang null pun akan ikut di tampilkan
                System.out.println(i + 1 + ". " + data.get(i));
            }
        }
    }
    public static void testShowTodoList(){
        data.add("Naufal Abdul");
        data.add("Hanacaraka");
        data.add("Datasawala");
        showTodolist();
    }
    /**
     * Membuat method untuk menambah todolist
     */
    public static void addTodoList(String todo){
        data.add(todo);
    }
    public static void testAddTodoList(){
        addTodoList("Halo bosque");
        addTodoList("Anjayy");
        showTodolist();
    }
    /**
     * Membuat method untuk menghapus todolist
     */
    public static void removeTodolist(Integer number){
        data.remove(number - 1);
    }
    public static void testRemoveTodoList(){
        data.add("Halo");
        data.add("Hal");
        data.add("Hao");
        data.add("Hlo");
        removeTodolist(2);
    }
    /**
     * Membuat method untuk menampilkan program ke layar
     */
    public static void viewShowTodoList(){
        boolean view = true;
        while (view){
            showTodolist();
            System.out.println("PILIH MENU");
            System.out.println("1 : Tambah Todolist");
            System.out.println("2 : Hapus TodoList");
            System.out.println("x : Keluar");
            String input = scanner.nextLine();
            if (input.equals("1")){
                viewAddTodoList();
            } else if (input.equals("2")){
                viewRemoveTodoList();
            } else if (input.equals("x")){
                view = false;
            } else {
                System.out.println("pilihan tidak dapat di pahami\n");
            }
        }
    }
    public static void testViewShowTodoList(){
        viewShowTodoList();
    }
    /**
     * Membuat method untuk menampilkan program penambahan
     * todolist ke layar
     */
    public static void viewAddTodoList(){
        System.out.println("Tambah Todo");
        System.out.println("x : kembali");
        String input = scanner.nextLine();
        if (input.equals("x")) {
            viewShowTodoList();
        } else {
            addTodoList(input);
        }
    }
    /**
     * Membuat method untuk menampilkan program penghapusan Todolist
     * ke layar
     */
    public static void viewRemoveTodoList(){
        System.out.println("Pilih no todo yang akan di hapus");
        showTodolist();
        int input = scanner.nextInt();
        for (int i = 0; i < data.size(); i++) {
            if (input == (i + 1)){
                removeTodolist(input);
            }
        }
    }

}
























