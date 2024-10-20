public class Main {
    public static void main(String[] args) {
        // Membuat objek Flight
        Flight flight = new Flight();

        // Menambahkan penumpang ke dalam daftar
        flight.addPassenger("Ujang Kopling");
        flight.addPassenger("Sugeng Cabe");
        flight.addPassenger("Dimas Mandalika");

        // Menampilkan semua penumpang dalam daftar
        System.out.println("Daftar Penumpang:");
        flight.displayPassengers();

        // Menghapus penumpang
        flight.removePassenger("Ujang Kopling");
        System.out.println("\nSetelah menghapus Ujang Kopling:");
        flight.displayPassengers();
    }
}