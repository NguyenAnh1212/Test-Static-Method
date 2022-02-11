public class Students {
//    private static String group = "Anh em nhóm 2";
    static String group = "Anh em nhóm 2";
    private int stt;
    private String name;
    private String address;

    public Students(int stt, String name, String address) {
        this.stt = stt;
        this.name = name;
        this.address = address;
    }
    static void change(){ // vì có static nên có thể gọi trực tiếp từ lớp
        group = "Anh em bạn phường";
    }
    void display(){ // vì không có static nên phải tạo đối tượng và truy xuất phương thức từ đối tượng.
        System.out.println(group + " " + stt + " " + name + " " + address );
    }
}
