public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change(); // Gọi phương thức từ lớp.
        Students.group = "Bộ 3 quyền lực"; // gọi thuộc tính từ lớp và thay đổi trực tiếp.
        // Tạo các đối tượng
        Students s1 = new Students(1,"Hoa","Hải Phòng");
        Students s2 = new Students(2,"Hải","Hải Dương");
        Students s3 = new Students(3,"Hồng","Thái Bình");
        // gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
