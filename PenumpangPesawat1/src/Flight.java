public class Flight {
    private Passenger head; // Menunjuk ke penumpang pertama dalam daftar

    public Flight() {
        this.head = null; // Inisialisasi head dengan null
    }

    // Metode untuk menambahkan penumpang di akhir daftar
    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name); // Membuat objek penumpang baru
        if (head == null) {
            head = newPassenger; // Jika daftar kosong, penumpang baru menjadi head
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next; // Mencari penumpang terakhir
            }
            current.next = newPassenger; // Menambahkan penumpang baru di akhir
        }
    }

    // Metode untuk menghapus penumpang berdasarkan nama
    public void removePassenger(String name) {
        if (head == null) return; // Jika daftar kosong, tidak ada yang dihapus

        // Jika penumpang pertama adalah yang ingin dihapus
        if (head.name.equals(name)) {
            head = head.next; // Menghapus penumpang pertama
            return;
        }

        Passenger current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next; // Menghapus penumpang
                return;
            }
            current = current.next; // Pindah ke penumpang berikutnya
        }
    }

    // Metode untuk menampilkan semua penumpang dalam daftar
    public void displayPassengers() {
        Passenger current = head;
        if (current == null) {
            System.out.println("Tidak ada penumpang dalam daftar.");
            return;
        }
        while (current != null) {
            System.out.println(current.name); // Menampilkan nama penumpang
            current = current.next; // Pindah ke penumpang berikutnya
        }
    }
}
