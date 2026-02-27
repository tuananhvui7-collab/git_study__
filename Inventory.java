import java.util.ArrayList;
public class Inventory {

    private ArrayList<Smartphone> list;
    public Inventory(){
        this.list = new ArrayList<>();
    }
    // Tạo các hàm CRUD ở đây
    // Create
    public void addSmartphone(Smartphone smartphone){
        this.list.add(smartphone);
    }

    // Read
    public ArrayList<Smartphone> getList(){
        return list;

    }
    // Tìm kiếm cũng là 1 loại xem
    public Smartphone findByName(String name){
        // dùng vòng lặp tìm
        for (Smartphone sp: list ){
            if (sp.getName().equalsIgnoreCase(name)){
                return sp;
            }
        }
        return null; // nếu k tìm thấy.
    }

    // Tìm kiếm theo index.
    // Phần tìm kiếm này thú thật là liếc gemini chứ viết đoạn code cho phần này làm tôi cháy CPU rồi, k viết nổi gì
    public Smartphone getByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return null;
    }

    // Theo tôi đây là 1 loại xem.
    public void showAll(){
        if (list.isEmpty()) {
            System.out.println("Kho trống!");
            return;
        }
        for (int i = 0; i <list.size(); i++){
            System.out.println("Sản phẩm " + i + " - Giá: " + list.get(i).getPrice() + " - Số lượng: " + list.get(i).stockQuantity());
        }
    }

    // Update
    public void setList(ArrayList<Smartphone> list){
        this.list = list;
    }
    // Update sản phẩm
    public void updateSmartphone(int index, Smartphone sp){
        if (index >= 0 && index < list.size()) {
            this.list.set(index, sp);
        }
    }
    // Delete
    public void deleteSmartphone(Smartphone sp){
        this.list.remove(sp);
    }



    // mấy cái tính năng này hình như đều là hàm có hết rồi :v vãi thật. thôi coi như code riêng tính năng đi



}
