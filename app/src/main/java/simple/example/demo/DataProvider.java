package simple.example.demo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.demo.model.Alat;
import simple.example.demo.model.Kipas;
import simple.example.demo.model.Mesin;
import simple.example.demo.model.Televisi;

public class DataProvider {
    private static List<Alat> alats = new ArrayList<>();

    private static List<Televisi> initDataTelevisi (Context ctx){
        List<Televisi> televisis = new ArrayList<>();
        televisis.add(new Televisi("Philips 32 Inch", "Rp. 2620000",
               "Brand TV LED terbaik selanjutnya ini memungkinkanmu menikmati foto, memutar video dan memainkan musik sekaligus.", R.drawable.philips_32));
        televisis.add(new Televisi("Samsung 32 Inch Smart TV LED", "Rp. 2680000",
                "Dengan desain yang sempurna, tipe TV LED terbaik dari Samsung ini memberikan kenyamanan menonton dari berbagai sisi.", R.drawable.samsung_smart));
        televisis.add(new Televisi("Polytron 40 Inch TV LED PLD 40S153", "Rp. 2810000",
                "Sebagai salah satu brand Televisi terbaik yang menjadi favorit, Polytron juga memiliki varian TV LED terbaik.t", R.drawable.politron_inch));
        televisis.add(new Televisi("Sony 40 Inch Bravia LED TV", "Rp. 5000000",
                "Smart TV Full HD ini dilengkapi dengan teknologi X-Reality PRO Picture yang mampu mengoptimalkan resolusi yang ditampilkan serta dapat melakukan streaming", R.drawable.soni_bravia_led));
        televisis.add(new Televisi("Cooca 40 Inch Smart TV LED ", "Rp. 3210000",
                "Layar yang ringkas dan resolusi tinggi, membuatnya mampu menghasilkan gambar yang detail dan tajam. Kamu pun akan lebih puas dalam menonton serial TV maupun film kesayangan.t", R.drawable.coocaa_smart));
        televisis.add(new Televisi("Aqua 40 Inch TV LED", "Rp. 2299000",
                "Produk ini terbukti mampu menampilkan visual jernih dan tajam, serta warna yang begitu nyata. Membawamu merasa ‘menyatu’ dengan setiap tayangan.", R.drawable.aqua_40_inch));
        return televisis;
    }

    private static List<Kipas> initDataKipasAngin(Context ctx) {
        List<Kipas> kipass= new ArrayList<>();
        kipass.add(new Kipas("Cosmos Wadesta", "Rp. 562000",
                "Untuk kamu yang sering nonton TV pasti familiar dengan iklan merk kipas angin satu ini, yang menampilkan Kipas Angin Cosmos Wadesta yang menempel di dinding, meja, dan lantai.", R.drawable.kipas_1));
        kipass.add(new Kipas("Hunter Kipas Angin", "Rp. 2899000",
                "jenis kipas angin adalah kipas angin langit-langit. Kipas angin langit-langit yang dipasang secara permanen pada bagian plafon rumah kamu ternyata lebih banyak yang suka.", R.drawable.kipas_2));
        kipass.add(new Kipas("Krisbow Kipas Angin", "Rp. 1349000",
                "jenis kipas angin adalah kipas angin dinding yang bisa menjangkau area lebih luas lagi. Makanya jenis kipas satu ini akan sangat cocok jika ditempatkan di ruangan yang menampung area lebih besar.", R.drawable.kipas_3));
        kipass.add(new Kipas("Kipas Angin Lantai (Floor Fan)", "Rp. 494000",
                "kipas angin lantai atau floor fan yang biasanya berukuran sedikit lebih besar daripada jenis kipas angin meja. Meskipun jika sepintas dilihat, bentuk dan modelnya mungkin mirip dengan kipas angin meja namun terdapat perbedaan ukuran dan fungsi.", R.drawable.flor_plan));
        kipass.add(new Kipas("Kipas Angin Exhaust Fan", "Rp. 1200000",
                "Kipas angin kotak ini berfungsi mengeluarkan udara dari dalam keluar dan sebaliknya. Biasanya jenis kipas ini akan dipasang di dalam dinding sehingga cocok ditempatkan di kamar mandi atau dapur. Hal tersebut juga berfungsi agar udara ruangannya tetap terjaga.", R.drawable.fan_ky));
        kipass.add(new Kipas("Kipas Angin Berdiri (Standing Fan)", "Rp. 4499000",
                "Kipas angin jenis ini sangat efektif untuk menjangkau tempat tinggi secara luas. Bahkan terdapat model yang kini telah dilengkapi fitur peniup uap air. Tujuannya agar angin yang dihembuskannya menjadi lebih sejuk.", R.drawable.kipas_6));
        return kipass;
    }

        private static List<Mesin> initDataMesinCuci(Context ctx) {
        List<Mesin> mesins = new ArrayList<>();
        mesins.add(new Mesin("Mesin front loading LG", "Rp. 2100000",
                "LG merupakan salah satu merek mesin cuci yang bagus dan sudah sangat dikenal di dunia elektronik " +
                        "+Mesin front loading LG dikenal memiliki fitur TrueSteam untuk mengurangi alergen dan menghilangkan kusut pada pakaian.", R.drawable.lg_k));
        mesins.add(new Mesin("Panasonic", "Rp. 3390000",
                "Hasil mencuci dari mesin cuci bukaan akan lebih higienis karena fitur Ag+Technology yang merupakan gabungan ion perak dan sinar UV untuk sterilisasi.", R.drawable.panasonic));
        mesins.add(new Mesin("Samsung", "Rp. 2850000",
                "Varian mesin cuci top loading, Samsung WA10M5120SG, memiliki fitur unggulan, yakni pencucian ramah lingkungan namun tetap dengan hasil yang maksimal.", R.drawable.ms_sam));
        mesins.add(new Mesin("Aqua", "Rp. 3250000",
                " Mesin cuci Aqua sangat mempermudah proses mencuci pakaian tanpa harus khawatir cucianmu rusak atau terdapat noda yang masih membandel.", R.drawable.ms_aq));
        mesins.add(new Mesin("Sanken", "Rp. 3339000",
                "Mesin cuci  2 tabung dan top loading Sanken juga sudah dilengkapi dengan teknologi X-Tor Big Pulsator untuk putaran yang lebih kuat dan Super Spin Dry untuk proses pengeringan yang lebih cepat.", R.drawable.sanken));
        mesins.add(new Mesin("Sharp", "Rp. 2999000",
               "Pada mesin cuci top loading, terdapat program mencuci yang bisa kamu pilih sesuai dengan pakaian yang akan dicuci.", R.drawable.sjh));
        return mesins;

   }


        private static void initAllAlats(Context ctx){
            alats.addAll(initDataTelevisi(ctx));
            alats.addAll(initDataKipasAngin(ctx));
            alats.addAll(initDataMesinCuci(ctx));
        }

    public static List<Alat> getAllAlat(Context ctx) {
        if (alats.size() == 0) {
            initAllAlats(ctx);
        }
        return  alats;
    }


        public static List<Alat> getAlatsByType (Context ctx, String jenis){
            List<Alat> alatsByType = new ArrayList<>();
            if (alats.size() == 0) {
                initAllAlats(ctx);
            }
            for (Alat h : alats) {
                if (h.getJenis().equals(jenis)) {
                    alatsByType.add(h);
                }
            }
            return alatsByType;

    }

}
