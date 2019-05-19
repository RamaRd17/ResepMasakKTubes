package com.example.resepmasak.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;

import com.example.resepmasak.Adapter.ExampleAdapter;
import com.example.resepmasak.SetGet.ExampleItem;
import com.example.resepmasak.R;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    private ExampleAdapter adapter;
    private List<ExampleItem> exampleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_coba);
        fillExampleList();
        setUpRecyclerView();
    }

    private void fillExampleList() {
        exampleList = new ArrayList<>();
        //Aceh
        exampleList.add(new ExampleItem("Kuah pliek u",
                "https://cdn.idntimes.com/content-images/post/20180928/e6c990958b5806e5399bc48467af1a11.png",
                "Bahan-bahan\n" +
                        "15 porsi\n" +
                        "1.\tBumbu Yang Dihaluskan:\n" +
                        "2.\t7 Siung Bawang Merah\n" +
                        "3.\t3 Siung Bawang Putih\n" +
                        "4.\t7 bh Cabe Merah\n" +
                        "5.\t20 bh Cabe Rawit (Sesuai selera, kalo suka pedas tambahkan lagi)\n" +
                        "6.\t1 Inci Jahe\n" +
                        "7.\t1 1/2 sdt Ketumbar\n" +
                        "8.\t1/4 sdt Jinten\n" +
                        "9.\tSecukupnya Lada\n" +
                        "10.\tSecukupnya Kunyit\n" +
                        "11.\t1 sdt bubuk cabe merah\n" +
                        "12.\t2 Sdm Kelapa\n" +
                        "13.\t3 sdm Patarana/Plik Ue (Sesuai Selera)\n" +
                        "14.\t1 inci Lengkuas (digeprek)\n" +
                        "15.\tBahan Yang Dirajang:\n" +
                        "16.\t3 btg Serai Cincang sehalus mungkin\n" +
                        "17.\t6 Lembar Daun Jeruk\n" +
                        "18.\t2 bh Bunga Kencong / Kala Cincang\n" +
                        "19.\tDaun Kari / Oen teumurui dirajang halus.\n" +
                        "20.\tSAYUR-SAYURAN:\n" +
                        "21.\t1/4 Kg Nangka Muda (Mata Kucing) Potong Kecil2\n" +
                        "22.\t4 ikat Daun Melinjo Cincang kecil\n" +
                        "23.\t1 Ons Buah Melinjo muda\n" +
                        "24.\t1 Bh jantung Pisang\n" +
                        "25.\tKates Muda / Mengkal (potong kecil / seukuran nangka)\n" +
                        "26.\t1 Ons Kacang Panjang Potong ukuran 1/2 Inci\n" +
                        "27.\t5 Bh Cabe Hijau potong kecil\n" +
                        "28.\t1/4 kg Udang Kecil, bersihkan\n" +
                        "29.\t2 Bh Kelapa\n" +
                        "30.\t1 Kg Sumpil / Cue\n" +
                        "31.\tsecukupnya Garam\n" +
                        "32.\tsecukupnya Air\n" +
                        "Langkah\n" +
                        "70 menit\n" +
                        "1.\tNangka, Sumpil, bumbu halus, bahan yang dirajang halus, Garam serta tambahkan sedikit air rebus sebentar agar bumbunya meresap.\n" +
                        "2.\tTambahkan Jantung Pisang dalam rebusan tadi, aduk dan tunggu sampai mendidih.\n" +
                        "3.\tSetelah Nangka dan jantung pisangnya empuk, tambahkan santan cair, diaduk sampai mendidih. kemudian tambahkan buah melinjo dan cabe hijau. kemudian tambahkan pati santan diaduk terus sampai mendidih. setelah itu tambahkan udang, daun melinjo, dan kacang panjang yg telah dipotong. diaduk..\n" +
                        "4.\tSetelah mendidih tambahkan kates yg telah dipotong td tnggu sampai mendidih dan matikan apinya. kuah plik ue siap dihidangkan..\n" +
                        "5.\t- untuk jantung pisang Bersihkan, ambil bagian dalam/ yg lunak, cuci, rendam dg garam, 1 menit kemudian cuci bersih\n" +
                        "- untuk kelapa Ambil Santannya, Ambil dan Pisahkan antara pati santan dan santan yang cair.\n" +
                        "- untuk cue/sumpil kalau ada dan suka tambahkan, potong ujungnya, cuci bersih, tambah kan garam, rendam, 1 menit kemudian cuci bersih",
                "Bawang,Cabe,Jahe,Lada,Kunyit,Lengkuas,"));
        exampleList.add(new ExampleItem("Sate matang",
                "https://cdn.idntimes.com/content-images/post/20180928/c4dbe8401b045d6c7cc886787f6b891e.jpg",
                "Bahan utama:\n" +
                        "•\t300 gram daging kambing, potong-potong kecil berbentuk dadu\n" +
                        "Bahan bumbu untuk membakar sate:\n" +
                        "•\t1 sdt ketumbar\n" +
                        "•\t1 siung bawang putih\n" +
                        "•\t1 siung bawang merah\n" +
                        "•\t1 batang serai\n" +
                        "•\t1 ruas jari jahe\n" +
                        "•\t1 ruas jari lengkuas\n" +
                        "•\t2 cm kunyit\n" +
                        "•\t2 butir kemiri\n" +
                        "•\tGaram secukupnya\n" +
                        "•\tGula merah secukupnya\n" +
                        "•\tMinyak secukupnya, untuk menumis\n" +
                        "Cara membuat sate:\n" +
                        "•\tHaluskan semua bumbu untuk membakar sate.\n" +
                        "•\tPanaskan minyak dan tumis bumbu yang sudah dihaluskan. Lalu masukan daging yang telah dipotong-potong. Tumis sebentar saja sampai bumbu meresap.\n" +
                        "•\tAngkat dan susun daging dengan tusuk sate, lalu bakar.\n" +
                        "Bahan bumbu kacang\n" +
                        "•\t2 ons kacang tanah, goreng lalu haluskan\n" +
                        "•\t1 siung bawang putih, untuk menumis\n" +
                        "•\t2 lembar daun salam\n" +
                        "•\t1 lembar daun jeruk purut\n" +
                        "•\t2 lembar daun pandan\n" +
                        "•\t1 batang kecil serai\n" +
                        "•\t1 batang kayu manis\n" +
                        "•\t2 ons cabai kering\n" +
                        "•\t500 ml santan\n" +
                        "•\t1 sdm gula putih\n" +
                        "•\tGula merah sedikit saja\n" +
                        "•\tKecap manis secukupnya\n" +
                        "Cara memasak bumbu kacang:\n" +
                        "•\tTumis semua bahan-bahan (kecuali kecap manis) sampai mengeluarkan aroma harum.\n" +
                        "•\tLalu masukkan santan. Tunggu sampai sedikit mendidih.\n" +
                        "•\tMasukkan kecang tanah yang sudah dihaluskan bersama cabai kering.\n" +
                        "•\tAduk sampai mendidih dan mengental hingga terlihat mengeluarkan minyak.\n" +
                        "•\tTambahkan kecap manis saat akan menyajikan sate matang dan saus bumbu kacang.\n" +
                        "Bahan kuah soto sate matang:\n" +
                        "•\t1/2 liter air matang\n" +
                        "•\t1 sdt ketumbar\n" +
                        "•\t1 siung bawang putih\n" +
                        "•\t1 siung bawang merah\n" +
                        "•\t1 batang serai\n" +
                        "•\t1 ruas jari jahe\n" +
                        "•\t1 ruas jari lengkuas\n" +
                        "•\t2 cm kunyit\n" +
                        "•\t2 butir kemiri\n" +
                        "•\t1/2 butir kelapa, untuk santan\n" +
                        "•\tGaram secukupnya\n" +
                        "•\tGula merah secukupnya\n" +
                        "Cara membuat kuah soto sate matang:\n" +
                        "1.\tRebus tulang daging kambing menggunakan air matang hingga mendidih dan menjadi kaldu.\n" +
                        "2.\tCampur semua bumbu menjadi satu dan haluskan. Lalu masukan ke dalam rebusan tulang.\n" +
                        "3.\tMasukkan santan ke dalam rebusan tulang yang telah dicampur dengan semua bumbu. Masak hingga mendidih.",
                "ketumbar,bawang,serai,jahe,lengkuas,kunyit,kemiri,"));
        exampleList.add(new ExampleItem("Ayam tangkap",
                "https://cdn.idntimes.com/content-images/post/20180928/0ed74d397404ea669a529bd29426f649.jpg",
                "Bahan-bahan yang diperlukan:\n" +
                        "•\t1 ekor ayam, disarankan ayam kampung\n" +
                        "•\t1 liter minyak goreng\n" +
                        "•\t8 tangkai daun salam koja (temurui)\n" +
                        "•\t4 lembar daun pandan, iris kasar\n" +
                        "•\t1 cangkir air matang\n" +
                        "•\t2 atau 3 buah cabai hijau\n" +
                        "Bumbu untuk Ayam Tangkap:\n" +
                        "•\t3 siung bawang putih untuk dirajang, dan 3 siung lagi untuk dihaluskan\n" +
                        "•\t3 buah bawang merah\n" +
                        "•\t5 buah cabe rawit\n" +
                        "•\t1 ruas kunyit sebesar ibu jari (2 cm)\n" +
                        "•\t1 ruas jahe sebesar ibu jari (2 cm)\n" +
                        "•\t1 sdt garam\n" +
                        "•\tAir asam jawa, secukupnya\n" +
                        "Cara membuatnya ayam tangkap khas Aceh:\n" +
                        "1.\tPotong ayam kampung menjadi 24-30 potongan, sesuai selera tapi usahakan kecil-kecil, kemudian cuci bersih. Bila perlu, remas-remas dengan air perasan jeruk nipis.\n" +
                        "2.\tHaluskan semua bumbu di atas, lalu campur dengan 200 ml air matang.\n" +
                        "3.\tMasukkan potongan ayam kecil-kecil ke dalam bumbu, dan rendam selama 10-15 menit.\n" +
                        "4.\tPanaskan minyak dalam wajan besar sampai benar-benar mendidih.\n" +
                        "5.\tLalu Goreng ayam sampai kecokelatan.\n" +
                        "6.\tSemua potongan ayam harus tenggelam dalam minyak dan jangan sampai terlalu berhimpitan satu sama lain.\n" +
                        "7.\tUntuk hasil terbaik, gunakan wajan yang besar, dengan 2 liter minyak goreng. Atau, jangan menggoreng sekaligus, melainkan sedikit demi sedikit. (Ingat: keberhasilan masakan sederhana ini sangat bergantung pada teknik menggoreng).\n" +
                        "8.\tSampai ayam terlihat matang, masukkan irisan bawang merah, daun salam koja, daun pandan, dan cabe hijau. Teruskan menggoreng sekitar tiga menit lagi.\n" +
                        "9.\tAngkat, tiriskan, dan segera hidangkan dalam keadaan panas.\n" +
                        "10.\tAyam tangkap siap Anda nikmati bersama dengan nasi putih hangat.",
                "ayam,minyak,daun,air,cabai,bawang,kunyit,jahe"));
        exampleList.add(new ExampleItem("Eungkot keumamah",
                "https://cdn.idntimes.com/content-images/post/20180928/4c00b7705a60a93bf8ea258188470c04.jpg",
                "Bahan-bahan\n" +
                        "•\t500 gram ikan tongkol kering ( ikan kayu, eungkot kayee )\n" +
                        "•\t100 gram kentang\n" +
                        "Bumbu\n" +
                        "•\t50 gram asam sunti\n" +
                        "•\t25 gram cabai merah\n" +
                        "•\t25 gram cabai hijau biarkan utuh\n" +
                        "•\t50 gram bawang merah\n" +
                        "•\t2 siung bawang putih\n" +
                        "•\t1 kelingking kunyit\n" +
                        "•\tGaram secukupnya\n" +
                        "•\t5 lembar duan jeruk nipis\n" +
                        "•\t1 tangkai daun kari\n" +
                        "•\t200 ml minyak kelapa\n" +
                        "Cara Membuat\n" +
                        "1.\tIkan kayu di sayat tipis-tipis, atau di suwir-suwir, lalu di rendam di air panas sampai lunak\n" +
                        "2.\tBumbu-bumbu kecuali cabai hijau, daun jeruk nipis dan daun kari di haluskan. Tumis bumbu halus dengan sedikit minyak sampai matang.\n" +
                        "3.\tTambahkan minyak kelapa, masukan ikan kayu. Masukan kentang, kacang panjang, dan cabai hijau utuh. Tambahkan air bila di perlukan. Masak sampai mendidih.\n" +
                        "4.\tBila kurang menyukai masakan yang berminyak. Penggunaan minyak kelapa dapat di kurangi sebanyak mungkin – misalkan hanya satu sendok makan untuk menumis bumbu dan pemasakan di lakukan dengan air, sajikan dengan nasi pulen panas.\n",
                "ikan,asam,cabai,bawang,kunyit,duan,minyak"));
        exampleList.add(new ExampleItem("Mie Goreng Aceh",
                "https://cdns.klimg.com/merdeka.com/i/w/news/2018/12/13/1031598/content_images/670x335/20181213114140-1-ilustrasi-mie-goreng-aceh-002-tantri-setyorini.jpg",
                "Bahan - Bahan\n" +
                        "            •\t600 ml air untuk merebus\n" +
                        "•\t300 gram mie telur, rebus dan tiriskan\n" +
                        "•\t200 gram dada ayam dipotong dadu\n" +
                        "•\t200 ml kaldu ayam\n" +
                        "•\t50 gram tauge\n" +
                        "•\t50 gram kol, iris tipis\n" +
                        "•\t5 sendok makan minyak untuk menumis\n" +
                        "•\t3 butir bawang merah, cincang halus\n" +
                        "•\t2 siung bawang putih, cincang halus\n" +
                        "•\t2 batang caisim, iris-iris\n" +
                        "•\t2 sendok makan kecap manis\n" +
                        "•\t1 lembar daun salam\n" +
                        "•\t1 sendok makan air jeruk nipis\n" +
                        "•\t1 batang daun bawang perai, iris 1 cm\n" +
                        "•\t1 sendok teh gula pasir\n" +
                        "•\t1/2 sendok makan garam\n" +
                        "•\t1/2 buah tomat, potong-potong\n" +
                        "Bumbu halus:\n" +
                        "•\t5 cabai merah keriting\n" +
                        "•\t5 butir bawang merah\n" +
                        "•\t3 siung bawang putih\n" +
                        "•\t2 cm kunyit\n" +
                        "•\t1 kapulaga, ambil bijinya\n" +
                        "•\t1/2 sendok teh jintan\n" +
                        "•\t1/2 sendok teh merica bubuk\n" +
                        "•\temping secukupnya\n" +
                        "Acar:\n" +
                        "•\t100 ml air\n" +
                        "•\t15 cabai rawit hijau utuh\n" +
                        "•\t1 buah timun, buang bijinya dan potong dadu\n" +
                        "•\t1 buah wortel besar, kupas dan potong dadu\n" +
                        "•\t1 sendok teh gula pasir\n" +
                        "•\t1 sendok teh cuka\n" +
                        "•\t1/2 sendok teh garam\n" +
                        "Cara membuat mie goreng aceh:\n" +
                        "1.\tUntuk membuat acar, campurkan semua bahan acar, aduk rata, dan diamkan kurang lebih setengah jam.\n" +
                        "2.\tRebus daging ayam hingga matang, kemudian tiriskan airnya dan potong-potong bentuk dadu.\n" +
                        "3.\tPanaskan minyak goreng, tumis bumbu halus dan daun salam hingga harum. Lalu masukkan daging ayam dan aduk rata.\n" +
                        "4.\tBumbui dengan kecap, gula, garam, kaldu dan air jeruk nipis. Masukkan tauge, kol, dan caisim. Masak hingga sayuran layu.\n" +
                        "5.\tMasukkan mie dan irisan daun bawang. Masak hingga mie meresap bumbu.\n" +
                        "6.\tDemikian resep mie goreng Aceh spesial. Sajikan dengan acar dan emping jika suka.",
                "mie,ayam,tauge,kol,minyak,bawang,caisim,kecap,daun,tomat"));
        exampleList.add(new ExampleItem("Eungkot Tumeh - Ikan Tumis Khas Aceh Pidie", "http://1.bp.blogspot.com/-lAsnuprfvbE/VhuF6H3Sm3I/AAAAAAAAEqM/Hoq60_YgZ68/s1600/IMG_0394.jpg", "Bahan\n" +
                "1 ekor ikan (kurang lebih 1 kg, aku pakai patin)\n" +
                "Jeruk nipis dan garam\n" +
                "4 buah belimbing sayur, iris memanjang buang bagian tengah yang mengandung biji\n" +
                "2 tangkai daun salam koja (uen temurui atau daun kari), lepas dari tangkainya\n" +
                "2 butir bawang merah, iris tipis\n" +
                "Minyak untuk menumis\n" +
                "Garam dan gula untuk penyedap\n" +
                "\n" +
                "Bumbu halus \n" +
                "7 buah cabe merah keriting\n" +
                "5 buah cabe rawit (bisa ditambah kalau suka pedas)\n" +
                "5 siung bawang merah\n" +
                "4 siung bawang putih\n" +
                "5 buah asam sunti\n" +
                "2 cm kunyit\n" +
                "1/2 cm jahe\n" +
                "1 sdt ketumbar\n" +
                "\n" +
                "Cara pembuatan\n" +
                "-Bersihkan ikan lalu potong serasi. Lumuri dengan jeruk nipis dan garam sampai rata, diamkan 15 menit lalu tiriskan.\n" +
                "-Lumuri kembali ikan dengan bumbu halus dan potongan belimbing sayur, diamkan selama 5 menit.\n" +
                "-Panaskan minyak di wajan, goreng bawang merah iris dan daun salam koja, setelah wangi, masukkan ikan berbumbu.\n" +
                "-Aduk perlahan sampai ikan berubah warna.\n" +
                "-Tuangi air sampai ikan hampir terendam, didihkan.\n" +
                "-Tambahkan garam dan gula, masak sampai ikan matang.\n" +
                "-Hidangkan dengan nasi panas yang agak pera.\n" +
                "\n" +
                "Catatan:\n" +
                "Tumis ikan ini hasil kuahnya kental walaupun tidak memakai santan. \n", "cabe,bawang,asam,kunyit,jahe,ketumbar"));
        exampleList.add(new ExampleItem("Ikan Gabus Khas Aceh", "https://img-global.cpcdn.com/003_recipes/4109ff1f707ac2a6/751x532cq70/ikan-gabus-masak-aceh-ungkoet-bace-kuah-u-neuleu-foto-resep-utama.jpg", "Bahan-bahan\n" +
                "•\t1 ekor ikan gabus ukuran sedang\n" +
                "•\t1 buah jeruk nipis\n" +
                "•\t2 batang sereh (memarkan)\n" +
                "•\t2 lembar daun jeruk\n" +
                "•\tSecukupnya garam\n" +
                "\n" +
                "BumbuHalus:\n" +
                "\n" +
                "•\t10 buah cabe rawit (pedas sesuai selera)\n" +
                "•\t3 buah cabe merah keriting\n" +
                "•\t4 buah bawang merah\n" +
                "•\t1/2 siung bawang putih\n" +
                "•\t1 iris jahe\n" +
                "•\t5 buah asam sunti\n" +
                "•\t2 SDM ketumbar\n" +
                "•\t2 SDM kelapa gongseng yg sudah dihaluskan sampai berminya\n" +
                "•\t1/2 SDT kunyit bubuk\n" +
                "\n" +
                "Langkah\n" +
                "\n" +
                "1.\tSiangi ikan, potong sesuai selerah dan bersihkan. Lalu lumuri dengan garam dan perasan jeruk nipis. Diamkan kurang lebih 15 menit\n" +
                "2.\tMasukkan ikan dalam wajan, tuangi bumbu halus dan sereh dan daun jeruk. Aduk rata.\n" +
                "3.\tMasak dengan api sedang sampai ikan benar-benar matang. Koreksi rasa, jika sudah pas matikan kompor.\n", "ikan,jeruk,sereh,"));
        exampleList.add(new ExampleItem("Kari Ayam Khas Aceh (Sie Manok Masak Mirah)", "https://3.bp.blogspot.com/-TxAhGCqwZM8/W9anFV5nXpI/AAAAAAAALt0/RTaDHo5NpFwhR2LylurnwiFLEPryOynHQCLcBGAs/s640/Resep%2BKari%2BAyam%2BMasakan%2BAsli%2BAceh.jpg", "Bahan-bahan\n" +
                "•\tSatu ekor ayam..dipotong2\n" +
                "•\t1 buah jeruk nipis\n" +
                "•\tasam jawa kira2 saru sendok makan\n" +
                "\n" +
                "Bahan Tumisan\n" +
                "•\t1 buah bawang bombay diiris tipis\n" +
                "•\t4 butir buah pekak\n" +
                "•\tDaun Temuru atau daun kari atau salam koja..\n" +
                "•\t1 batang serai dimemarkan\n" +
                "\n" +
                "Bumbu Halus\n" +
                "•\t2 sendok makan bubuk cabe merah ( atau sesuai selera pedas atau enggak )\n" +
                "•\t2 buah bawang bombay\n" +
                "•\t4 siung bawang putih\n" +
                "•\tseruas jari jahe\n" +
                "•\tSetengah sendok teh merica bubuk\n" +
                "•\tseperempat sendok teh pala bubuk\n" +
                "•\tsetengah sendok teh jintan bubuk\n" +
                "•\tHampir satu sendok teh ketumbar \n" +
                "•\tsetengah sendok teh kunyit bubuk\n" +
                "•\tsatu sendok teh bumbu kari *\n" +
                "•\t6 sendok makan kelapa gonseng yang digiling halus.\n" +
                "\n" +
                "Cara membuat\n" +
                "•\tAyam sebelum dipotong2..dipanggang dulu sebentar didalam oven....kira2 5-7 menit \n" +
                "•\tSetelah itu ayamnya dipotong dan diberi garam secukupnya dan air perasan jeruk nipis yg dicampur dengan air asam jawa.**\n" +
                "•\tCampur ayam dengan bumbu halus...aduk hingga rata.\n" +
                "•\tPanaskan sedikit minyak...tumis bawang bombay yang diiris2 halus, serai, biji pekak dan daun kari. \n" +
                "•\tSetelah bawangnya layu dan wangi...masukkan sedikit bumbu halus...aduk2 sebentar....lalu baru masukkan ayam yg sudah dibumbui tadi......tambahkan air....masak dengan api sedang...kalau airnya sudah agak berkurang tambahin lagi hingga ayamnya matang. \n" +
                "•\tSebelum dimatikan apinya jangan lupa icip dulu rasa garamnya...sudah pas atau belom.....\n" +
                "•\tNah....ayamnya pun siap disantap dengan nasi panas.... Selamat mencoba\n", "ayam,jeruk,asam,bawang,pekak,Temuru,serai"));
        exampleList.add(new ExampleItem("Gulai Tumis Udang Aceh Pidie", "https://cuek.files.wordpress.com/2007/09/udang.jpg", "Bahan-bahan\n" +
                "•\tUdang agak besar 1/2 kg, buang kepalanya\n" +
                "•\tDaun jeruk 2 buah\n" +
                "•\tSere 1 buah\n" +
                "•\tSantan kental 150 ml\n" +
                "•\tKentang 1 buah ukuran besar,\n" +
                "•\tCabe hijau 2 buah, iris memanjang\n" +
                "\n" +
                "Bumbu \n" +
                "•\tBawang merah haluskan 1 buah, besar\n" +
                "•\tBawang putih 3 buah, haluskan\n" +
                "•\tKunyit bubuk 1/2 tsp\n" +
                "•\tKetumbar bubuk 1/2 tsp\n" +
                "•\tJintan 1/4 tsp\n" +
                "•\tGaram dan gula sebagai perasa\n" +
                "•\tJahe setengah iris, rajang kasar\n" +
                "•\tCabe merah atau sambal oelek 1 tsp (boleh tambah kalo suka pedes)\n" +
                "\n" +
                "Cara Pembuatan \n" +
                "•\tCuci dan lumuri udang dengan air jeruk nipis, rendam 15 min dengan jeruk nipis biar ga amis\n" +
                "•\tPanaskan wajan kemudian, tumis bawang halus dan masukkan daun jeruk maupun sere, biarkan sampe wangi\n" +
                "•\tMasukkan jahe dan udang, aduk sebentar sampe udang berubah warna\n" +
                "•\tTambahkan semua bumbu bubuk, garam dan santan\n" +
                "•\tBiarkan sampe matang dan aduk agar santan ga pecah\n" +
                "•\tKetika sudah mau matang cemplungkan irisan cabe hijau\n" +
                "•\tAngkat dan sajikan hangat dengan nasi sebakul.\n", "Udang,Daun,Sere,Santan,Kentang,Cabe"));
        exampleList.add(new ExampleItem("Kanji Rumbi (Bubur Kanji ala India)", "https://dennypedia.com/wp-content/uploads/2017/09/Resep-Bubur-Kanji-Rumbi-Aceh-Sedap.jpg", "Bahan-bahan\n" +
                "•\t1/4 Kg beras (cuci dan rendam), \n" +
                "•\t1/2 ekor ayam cuci bersih, \n" +
                "•\t250 gr udang rebus, \n" +
                "•\tBawang goreng, \n" +
                "•\tGaram secukup nya. \n" +
                "\n" +
                "Bumbu \n" +
                "•\t1 sdm ketumbar, \n" +
                "•\t1 sdt merica, \n" +
                "•\t1 sdt adas manis, \n" +
                "•\t3 buah peka, \n" +
                "•\tseruas jari kayu manis, \n" +
                "•\t8 bawang merah, \n" +
                "•\t1/2 ruas jari jahe, \n" +
                "•\t1/2 buah biji pala. \n" +
                "\n" +
                "semua bahan dihaluskan dan dibungkus dengan kain tipis. \n" +
                "Cara membuat \n" +
                "•\tBeras disangrai sampai kuning dan ditumbuk kasar. \n" +
                "•\tRebus ayam dan beras, hingga ayamnya empuk dan berasnya menjadi bubur. \n" +
                "•\tAyam empuk potong-potong bentuk dadu. \n" +
                "•\tKedalam rebusan bubur masukan bumbu yang sudah dibungkus, garam. \n" +
                "•\tSetelah matang hidangkan dengan menabur ayam potong dadu, \n" +
                "•\tudang rebus, dan bawang goreng.\n", "beras,ayam,udang,bawang,garam,ketumbar,merica,adas,kayu,jahe,pala"));
        //Bali
        exampleList.add(new ExampleItem("Bebek betutu","https://cdn.idntimes.com/content-images/post/20180702/88e160f8a6a91e3b7ec32923ed347dca.jpg","Bahan-bahan yang diperlukan:\n" +
                "1 ekor bebek, belah tengah dan lebarkan\n" +
                "1 buah jeruk nipis\n" +
                "1/2 sendok makan garam\n" +
                "90 ml santan kental\n" +
                "Bahan untuk bumbu:\n" +
                "5 cabai merah besar, buang bijinya, iris halus\n" +
                "5 cabai merah keriting, iris halus\n" +
                "5 cabai rawit orange, iris halus\n" +
                "10 siung bawang merah, iris halus\n" +
                "5 siung bawang putih, iris halus\\n" +
                "2 batang serai, ambil bagian putihnya, cincang halus\n" +
                "1 ruas kencur cincang halus\n" +
                "2 ruas jahe, cincang halus\n" +
                "2 sendok teh terasi bakar\n" +
                "2 ruas lengkuas, iris kasar, dan pipihkan\n" +
                "1 ruas kunyit bakar, cincang halus\n" +
                "1/4 sendok teh kunyit bubuk\n" +
                "8 buah kemiri sangrai, tumbuk kasar\n" +
                "1 sendok teh ketumbar bubuk\n" +
                "1 sendok teh merica bubuk\n" +
                "1 sendok teh pala bubuk\n" +
                "3 lembar daun jeruk, buang tulang tengahnya dan iris halus\n" +
                "|5 lembar daun salam, robek kasar\n" +
                "tgaram, gula, dan kaldu bubuk secukupnya\n" +
                "Cara membuat:\n" +
                "1.Siapkan bebek, lumuri permukaannya dengan air jeruk nipis dan garam hingga merata. Biarkan bebek selama 15 menit. Cuci bersih.+\n" +
                "2.Siapkan wajan dan panaskan minyak. Masukkan semua bahan bumbu, tumis hingga harum dan matang.\n" +
                "3.Tambahkan garam, gula, kaldu bubuk, dan bubuk-bubuk lainnya (sesuai selera). Aduk rata.\n" +
                "4.Masukkan bebek dan lumuri permukaannya dengan tumisan bumbu. Tutup wajan dan ungkep dengan api kecil hingga berubah warna dan bumbu meresap.\n" +
                "5.Masukkan 1/2 campuran air dan santan, aduk-aduk hingga santan dan bumbu tercampur merata. Tutup wajan rapat-rapat dan masak hingga air habis.\n" +
                "6.Balikkan bebek, masukkan 1/2 sisa santan, tutup wajan dan masak kembali hingga air habis dan bebek matang.\n" +
                "7.Untuk mengetahui apakah bebek telah matang hingga bagian dalamnya, tusuk dan robek dengan garpu. Jika belum matang, tambahkan air dan masak hingga matang.\n" +
                "8.Untuk hasil maksimal, panggang sebentar di oven. Bisa juga dipanggang di bara atau panggangan di kompor.\n" +
                "9.Siapkan loyang datar, alasi loyang dengan selembar alumunium foil. Letakkan ayam beserta seluruh bumbunya di atas alumunium foil. Panggang di dalam oven bersuhu 180 derajat celcius selama 15-20 menit hingga bumbu terlihat mengering.\n" +
                "10.Keluarkan bebek dari oven, bebek betutu siap untuk disajikan","bebek,jeruk,garam,santan,cabai,bawang,serai,kencur,jahe,terasi,lengkuas,kunit,kemiri,ketumbar,merica,pela,daun" ));
        exampleList.add(new ExampleItem("Ayam suwir","https://cdn.idntimes.com/content-images/post/20180702/fed834911285189a28e333180c5a2691.jpg","Bahan-bahan yang diperlukan:\n" +
                "250 gram ayam, kukus\n" +
                "2 siung bawang putih, haluskan\n" +
                "5 siung bawang merah, iris tipis\n" +
                "2 ruas jari lengkuas, geprek\n" +
                "5 helai daun jeruk\n" +
                "2 sendok makan cabai merah halus\n" +
                "2 buah cabai merah, iris\n" +
                "2 batang serai, iris halus\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh gula\n" +
                "100 ml santan kental\n" +
                "Cara memasak:\n" +
                "1.Kukus ayam hingga matang, angkat, suwir.\n" +
                "2.Tumis bawang putih hingga harum. Masukkan bawang merah, tumis hingga harum kembali.\n" +
                "3.Masukkan lengkuas dan daun jeruk hingga matang.\n" +
                "4.Masukkan ayam kukus dan cabai halus, aduk rata. Taburi serai dan cabai merah.\n" +
                "5.Tambahkan air secukupnya agar masakan tidak kering.\n" +
                "6.Masukkan 100 ml santan kental, tumis hingga masak.\n" +
                "7.Sajikan dengan nasi hangat agar lebih mantap.\n","ayam,bawang,lengkuas,daun,cabai,serai,garam,gula" ));
        exampleList.add(new ExampleItem("Sambal embe","https://cdn.idntimes.com/content-images/post/20180702/e92b7c52c3a0abfc40aa9675dcf4f469.jpg","Bahan-bahan yang diperlukan:\n" +
                "5 siung bawang merah, iris tipis\n" +
                "7 siung bawang putih, iris tipis\n" +
                "13 buah cabai rawit\n" +
                "garam secukupnya\n" +
                "air jeruk limau secukupnya\n" +
                "kaldu ayam bubuk (opsional)\n" +
                "minyak goreng secukupnya\n" +
                "Cara membuat:\n" +
                "1.\tGoreng bawang merah dan bawang putih hingga setengah matang atau kering sesuai selera.\n" +
                "2.\tGoreng cabai rawit, haluskan dengan cobek.\n" +
                "3.\tCampur bawang goreng bersama cabai yang telah dihaluskan.\n" +
                "4.\tTambahkan garam dan kaldu ayam bubuk secukupnya. Tambahkan gula sesuai selera.\n" +
                "5.\tAduk hingga rata, sambal pun siap untuk disajikan\n","bawang,cabai,garam,limau,kaldu,miyak," ));
        exampleList.add(new ExampleItem("Plecing kangkung","https://cdn.idntimes.com/content-images/post/20180702/91da91d1d6f4ee9ca50bdf4400a3dfff.jpg","Bahan-bahan:\n" +
                "500 gram kangkung\n" +
                "1 sendok teh garam\n" +
                "Bahan untuk sambal plecing:\n" +
                "7 buah cabai merah bakar\n" +
                "6 buah cabai rawit merah bakar\n" +
                "1 sendok teh terasi bakar\n" +
                "8 butir bawang merah\n" +
                "5 siung bawang putih\n" +
                "2 cm kencur\n" +
                "100 gram tomat merah\n" +
                "2 sendok makan air jeruk limau\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh gula pasir\n" +
                "1 sendok teh merica\n" +
                "Cara pembuatan:\n" +
                "1.\tBlansir kangkung dengan cara didihkan air, lalu masukkan kangkung dan garam. Masak sampai agak layu. Angkat dan tiriskan.\n" +
                "2.\tHaluskan cabai merah, cabai rawit merah, terasi, bawang putih, bawang merah, kencur, dan tomat merah.\n" +
                "3.\tBumbui dengan garam, gula, dan air jeruk limo. Aduk hingga rata.\n" +
                "4.\tSajikan kangkung dengan bumbu.\n","garam,cabai,terasi,bawang,kencur,tomat,limau,garam,gula,merica"));
        exampleList.add(new ExampleItem("Lawar","https://cdn.idntimes.com/content-images/post/20180702/a1254ed3932cbe734837a20379fc39be.jpg","Bhan-bahan yang dibutuhkan:\n" +
                "100 gram kelapa parut (setengah tua)\n" +
                "150 gram daging ayam rebus, disuwir\n" +
                "100 garam kacang panjang, potong 2 cm, lalu rebus setengah matang\n" +
                "100 gram kecambah, rebus\n" +
                "2 sendok makan gula merah, disisir\n" +
                "2 sendok makan minyak untuk menumis\n" +
                "1 buah mentimun, potong dadu kecil\n" +
                "3 sendok makan bawang goreng\n" +
                "1 buah jeruk nipis\n" +
                "1 sendok teh garam\n" +
                "Bahan untuk bumbu halus:\n" +
                "3 buah cabai merah, buang bijinya\n" +
                "10 buah cabai rawit (atau sesuai selera)\n" +
                "6 butir bawang merah\n" +
                "2 siung bawang putih\n" +
                "1/2 sendok teh lada\n" +
                "2 butir kemiri\n" +
                "1 cm jahe\n" +
                "1 cm lengkuas\n" +
                "2 cm kencur\n" +
                "1/2 sendok teh ketumbar\n" +
                "1/2 blok terasi\n" +
                "Cara membuat:\n" +
                "1.\tTumis bumbu halus sampai harum.\n" +
                "2.\tMasukkan garam, gula merah, dan tiga sendok makan air. Aduk rata.\n" +
                "3.\tMasukkan daging ayam, kelapa parut, kacang panjang, dan kecambah.\n" +
                "4.\tMatikan kompor, masukkan irisan mentimun. Aduk rata.\n" +
                "5.\tSebelum dihidangkan, tambahkan air perasan jeruk nipis dan taburan bawang goreng.\n","kelapa,ayam,kacang,kecabah,gula,miyak,mentimun,nipis,cabai,bawang,lada,jae,lengkuas,kencur,ketumbar,terasi" ));
        exampleList.add(new ExampleItem("Sambal Betongkol","http://2.bp.blogspot.com/-ctW2uhaRsiE/VK3-jQrLsJI/AAAAAAAAAZs/yQOFLJ3jezY/s1600/tongkol+sambal.jpg","BAHAN :\n" +
                "\n" +
                "350 gram daging ikan tongkol\n" +
                "3 sdm bawang goreng\n" +
                "3 sdm minyak goreng\n" +
                "BUMBU RENDAMAN IKAN :\n" +
                "\n" +
                "8 butir bawang merah\n" +
                "6 siung bawang putih\n" +
                "4 cm kunyit\n" +
                "4 buah cabai merah\n" +
                "1 buah tomat\n" +
                "3 cm jahe\n" +
                "1 sdt ketumbar\n" +
                "4 butir kemiri\n" +
                "1/2 sdt terasi\n" +
                "2 sdm air asam\n" +
                "BUMBU SAMBAL :\n" +
                "\n" +
                "1 sdt air jeruk nipis\n" +
                "BUMBU HALUS SAMBAL :\n" +
                "\n" +
                "9 butir bawang merah\n" +
                "8 siung bawang putih\n" +
                "4 buah cabai rawit\n" +
                "5 lembar daun jeruk\n" +
                "1/2 sdt garam\n" +
                "1/2 merica bubuk\n" +
                "CARA MEMBUAT SAMBAL BETONGKOL:\n" +
                "\n" +
                "1.\tLumuri ikan dengan bumbu perendam lalu diamkan selama 15 menit.\n" +
                "2.\tGoreng sambil diaduk-aduk sampai ikan agak hancur dan matang.\n" +
                "3.\tCampur bumbu halus sambal dengan air jeruk nipis. Masukkan ikan lalu aduk rata.\n" +
                "4.\tHidangkan dengan menambahkan bawang goreng.\n" +
                "5.\tSajikan untuk 6 porsi\n","bawang,miyak,kunit,cabai,tomat,jahe,ketumbar,kemiri,terasi,asam,jeruk," ));
        exampleList.add(new ExampleItem("Sate Lilit Ikan Kakap","http://www.vonholzenphoto.com/wp-content/uploads/2016/12/Satay-Lilit.jpg","BAHAN :\n" +
                "\n" +
                "250 gram daging ikan kakap giling halus, ganti ikan tuna, tongkol, dll boleh bahkan daging ayam juga boleh pada sate lilit ayam \n" +
                "250 gram udang kupas, giling halus\n" +
                "50 gram kelapa muda parut, sangrai\n" +
                "3 sdm air asam Jawa\n" +
                "1 sdt gula merah\n" +
                "1/2 sdt garam\n" +
                "3 sdm minyak goreng\n" +
                "28 batang serai unyuk tusuknya\n" +
                "BUMBU HALUS :\n" +
                "\n" +
                "8 buah cabai merah\n" +
                "6 cm kunyit\n" +
                "15 butir bawang merah\n" +
                "8 siung bawang putih\n" +
                "5 cm kunyit\n" +
                "1 buah tomat\n" +
                "5 cm jahe\n" +
                "2 sdt ketumbar\n" +
                "6 butir kemiri\n" +
                "2 sdt terasi\n" +
                "CARA MEMBUAT SATE LILIT IKAN KAKAP :\n" +
                "\n" +
                "1.\tCampur ikan, udang, kelapa sangrai, air asam, gula merah, garam, minyak goreng, dan bumbu halus. Aduk rata.\n" +
                "2.\tKepal-kepalkan ikan sambil dibentuk lonjong memanjang.\n" +
                "3.\tTusukkan serai lalu kepal-kepal lagi agar menempel.\n" +
                "4.\tBakar di atas bara api hingga kecokelatan dan matang.\n" +
                "5.\tSajikan untuk 28 tusuk.\n","kian,uang,kelapa,asam,gula,garam,miyak,cabai,kunyit" ));
        exampleList.add(new ExampleItem("Gedang Mekuah","https://resepdanmasakan.com/wp-content/uploads/2017/09/Gedang-Mekuah.jpg","BAHAN :\n" +
                "\n" +
                "400 gram pepaya mentah, dipotong tipis dan lebar\n" +
                "2 lembar daun salam\n" +
                "2 batang serai, dimemarkan\n" +
                "1 liter kaldu\n" +
                "1 1/2 sdt garam\n" +
                "1 sdt merica\n" +
                "2 sdm minyak goreng untuk menumis\n" +
                "BUMBU HALUS :\n" +
                "\n" +
                "5 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "4 cm lengkuas\n" +
                "5 cm kunyit\n" +
                "3 buah cabai merah\n" +
                "2 buah cabai rawit\n" +
                "3 cm kencur\n" +
                "1 sdt terasi\n" +
                "CARA MEMASAK GEDANG MEKUAH :\n" +
                "\n" +
                "1.\tTumis bumbu halus sampai harum, masukkan daun salam dan serai. Aduk sampai daun salam layu.\n" +
                "2.\tTuang kaldu. Biarkan mendidih lalu tambahkan pepaya muda, Bumbui dengan garam dan merica.\n" +
                "3.\tMasak sampai pepaya lunak dan bumbu meresap di atas api kecil.\n" +
                "4.\tSajikan untuk 6 porsi.\n","pepaya,daun,serai,kaldu,garam" ));
        exampleList.add(new ExampleItem("Ayam Pelalah","http://farlys.com/wp-content/uploads/2013/03/ayam-pelalah.jpg","BAHAN :\n" +
                "\n" +
                "1 ekor ayam\n" +
                "BUMBU HALUS :\n" +
                "\n" +
                "11 butir bawang merah\n" +
                "15 siung bawang putih\n" +
                "4 cm kencur\n" +
                "4 cm lengkuas\n" +
                "6 butir kemiri\n" +
                "5 cm kunyit\n" +
                "4 sdt gula merah\n" +
                "2 batang serai, dipotong-potong\n" +
                "3 lembar daun salam\n" +
                "6 buah cabai rawit\n" +
                "3 1/4 sdt garam\n" +
                "BAHAN SAMBAL :\n" +
                "\n" +
                "2 sdt air jeruk nipis\n" +
                "BUMBU HALUS SAMBAL :\n" +
                "\n" +
                "6 butir bawang merah, diiris lalu digoreng\n" +
                "5 siung bawang putih diiris lalu digoreng\n" +
                "4 buah cabai merah, dipotong-potong lalu digoreng\n" +
                "1 buah tomat\n" +
                "1 sdt terasi, digoreng\n" +
                "CARA MEMASAK AYAM PELALAH :\n" +
                "\n" +
                "1.\tLumuri ayam dengan bumbu halus lalu oven sampai matang dengan suhu 180 derajat celcius selama 25 menit.\n" +
                "2.\tSetelah dingin suwir-suwir daging ayamnya.\n" +
                "3.\tCampur bumbu halus sambal dengan air jeruk nipis. Masukkan suwiran daging ayam. Aduk rata.\n" +
                "4.\tSajikan untuk 3 porsi.\n","ayam,bawang,kencur,lengkuas,kemiri,kunyit,gula" ));
        exampleList.add(new ExampleItem("Kikil Mekuah","https://img-global.cpcdn.com/003_recipes/967a8eddf74cb814/751x532cq70/kikil-kuah-kuning-foto-resep-utama.jpg","BAHAN :\n" +
                "\n" +
                "500 gram kikil, dipotong-potong\n" +
                "5 lembar daun jeruk purut, diiris halus\n" +
                "2 buah cabai merah, buang biji, iris halus\n" +
                "2 sdm minyak goreng\n" +
                "1/2 sdt merica\n" +
                "2 sdt garam\n" +
                "250 ml kaldu daging\n" +
                "Bawang goreng untuk taburan\n" +
                "BUMBU HALUS :\n" +
                "\n" +
                "6 butir bawang merah, dicincang\n" +
                "3 siung bawang putih, dicincang\n" +
                "3 cm jahe, dicincang\n" +
                "2 cm kunyit, dicincang\n" +
                "5 butir kemiri disangrai, lalu haluskan\n" +
                "1/2 sdt garam\n" +
                "CARA MEMASAK KIKIL MEKUAH :\n" +
                "\n" +
                "1.\tDidihkan 2 liter air bersama 2 sdt garam lalu masukkan kikil. Rebus sampai kikil lunak, angkat dan buang airnya.\n" +
                "2.\tTumis bumbu sampai harum bersama cabai merah dan daun jeruk. Aduk sampai layu, masukkan kikil. Aduk-aduk.\n" +
                "3.\tTuang kaldu dan rebus lagi hingga bumbu meresap.\n" +
                "4.\tSajikan dengan menaburkan bawang goreng untuk 6 porsi.\n","daun,cabai,miyak,merica,garam,kaldu,bawang" ));
        //Goreng
        exampleList.add(new ExampleItem("Tempe Mendoan","https://cdn-image.hipwee.com/wp-content/uploads/2015/03/mendoan-kering-1-750x563.jpg","Bahan yang kamu butuhkan:\n" +
                "\n" +
                "10 potong tempe berukuran 10 x 15 cm\n" +
                "100 gram tepung terigu\n" +
                "125 ml air\n" +
                "2 batang daun bawang, diiris halus\n" +
                "Minyak untuk menggoreng\n" +
                "\n" +
                "Bumbu yang dihaluskan:\n" +
                "\n" +
                "3 siung bawang putih\n" +
                "3/4 sendok teh ketumbar\n" +
                "1 cm kencur\n" +
                "Garam secukupnya.\n" +
                "\n" +
                "Cara membuatnya:\n" +
                "\n" +
                "1.\tPertama-tama kamu aduk rata tepung terigu, air, dan bumbu yang halus.\n" +
                "2.\tTambahkan daun bawang lalu aduk rata.\n" +
                "3.\tKemudian celupkan tempe ke dalam adonan tepung. Goreng sampai setengah kering.\n" +
                "4.\tLalu angkat dan sajikan.\n","tempe,tepung,air,daun,minyak,bawang,teh,ketumbar,kencur,garam" ));
        exampleList.add(new ExampleItem("Bakwan","https://cdn-image.hipwee.com/wp-content/uploads/2015/03/fc682070e3e5bcc204098a1a922c984d.jpg","Bahan yang kamu butuhkan :\n" +
                "\n" +
                "100 gram tepung terigu protein sedang\n" +
                "50 gram tepung beras\n" +
                "100 gram wortel, dipotong korek api\n" +
                "75 gram taoge\n" +
                "150 gram kol, diiris halus\n" +
                "50 gram jamur tiram, disuwir halus\n" +
                "1 batang daun bawang, diiris halus\n" +
                "200 ml air\n" +
                "\n" +
                "Selanjutnya, bumbu yang kamu perlukan:\n" +
                "\n" +
                "2 siung bawang putih, dihaluskan\n" +
                "1/2 sdt kaldu ayam bubuk\n" +
                "1 sdt garam\n" +
                "1/2 sdt merica bubuk\n" +
                "1/2 sdm ketumbar bubuk\n" +
                "1/2 sdt gula pasir\n" +
                "\n" +
                "Cara membuat bakwan sayur yang renyah dan gurih :\n" +
                "\n" +
                "1.\tPertama-tama, kamu campurkan tepung terigu, bawang putih, kaldu ayam, garam, merica bubuk, ketumbar, dan gula pasir. Lalu kamu aduk hingga rata.\n" +
                "2.\tTuangkan air sedikit demi sedikit sambil diaduk hingga tercampur rata.\n" +
                "3.\tLalu kamu tambahkan wortel, taoge, kol, jamur, dan daun bawang. Jangan lupa kamu aduk rata ya.\n" +
                "4.\tSetelah itu, gunakan sendok untuk menggoreng  adonan dalam minyak panas.\n" +
                "5.\tJika antar adonan saling menempel, kamu bisa siram-siram dengan minyak yang ada di wajan hingga terlepas. Lalu biarkan sampai matang.\n","" ));
        exampleList.add(new ExampleItem("Tahu Isi","https://cdn-image.hipwee.com/wp-content/uploads/2015/03/ef804ff33d389280f14d1a982f6872ee.jpeg.600x0_q85_crop-smart_upscale2.jpg","Bahan yang kamu butuhkan\n" +
                "\n" +
                "5 buah tahu putih kecil, potong diagonal, bagi 2 bagian, kerok bagian tengahnya\n" +
                "\n" +
                "Bahan untuk isi tahu :\n" +
                "\n" +
                "120 gram hasil kerokan tahu putih, haluskan\n" +
                "50 gram ayam fillet, cincang halus\n" +
                "50 gram wortel, potong korek api\n" +
                "25 gram buncis, iris halus\n" +
                "25 gram taoge, buang akarnya\n" +
                "1 putih telur, kocok lepas\n" +
                "1 tangkai seledri, iris halus\n" +
                "3/4 sendok teh garam\n" +
                "1/4 sendok teh merica bubuk\n" +
                "\n" +
                "Bumbu yang harus dihaluskan untuk merendam tahu :\n" +
                "\n" +
                "2 siung bawang putih, haluskan\n" +
                "1 sendok teh garam\n" +
                "1 sendok teh ketumbar bubuk\n" +
                "100 ml air\n" +
                "\n" +
                "Bahan untuk membuat tepung pelapis tahu :\n" +
                "\n" +
                "125 gram tepung terigu protein sedang\n" +
                "1/2 sdt ketumbar bubuk\n" +
                "2 siung bawang putih, haluskan\n" +
                "1/2 sdt garam\n" +
                "200 ml air\n" +
                "\n" +
                "Cara pembuatannya adalah  :\n" +
                "\n" +
                "1.\tPertama-taman kamu rendam tahu putih pada bumbu yang sudah disiapkan.\n" +
                "2.\tNah, sembari merendam, kamu bisa masak isi tahu : Pertama aduk rata semua bahan isi (hasil kerokan isi tahu, ayam, wortel dll) pada panci yang berbeda. Setelah rata, kamu bisa masukan sayuran ini kedalam tahu menggunakan sendok.\n" +
                "3.\tLalu celup dalam larutan tepung yang sudah dibumbui.\n" +
                "4.\tKemudian, kamu masukkan dalam wajan yang berisi minyak goreng yang sudah dipanaskan dengan api sedang sampai matang.\n" +
                "5.\tTunggu hingga kuning kecoklatan, dan angkat.\n" +
                "6.\tJadi deh.\n","tahu,ayam,wortel,buncis,taoge,telur,seledri,garam,merica,bawang,ketumbar" ));
        exampleList.add(new ExampleItem("Ayam Goreng Renyah yang Empuk, Lezar dan Enak","https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-goreng.jpg","Bahan Utama Ayam: \n" +
                "\n" +
                "1/2 ekor ayam 1 lembar daun salam \n" +
                "1 batang serai memarkan \n" +
                "secukupnya penyedap rasa \n" +
                "400 ml air \n" +
                "secukupnya garam \n" +
                "1/2 sendok teh gula pasir \n" +
                "secukupnya minyak untuk menggoreng\n" +
                "\n" +
                "Bahan dan Bumbu yang Dihaluskan:\n" +
                "\n" +
                "3 cm lengkuas \n" +
                "3 buah bawang merah \n" +
                "1 cm kunyit 2 cm \n" +
                "jahe 1 butir\n" +
                "kemiri 4 siung bawang putih \n" +
                "1 1/2 sendok teh ketumbar\n" +
                "\n" +
                "Langkah-langkah Cara Membuat Ayam Goreng Renyah yang Empuk, Lezat dan Enak\n" +
                "Tips Mempersiapkan Ayam Sebelum Diolah: \n" +
                "1.\tUntuk yang pertama kali bisa dilakukan adalah dengan mempersiapkan bahan utama yakni ayamnya. Sebelum ayam diolah menjadi hidangan utama yang enak dan sedap, ada beberapa bagian pada ayam yang harus kita bersihkan secara merata karena bagian tersebut tidak akan kita gunakan. Nah, untuk membersihkan ayam yang pertama terlebih dahulu silahkan potong-potong ayam utuh yang sudah anda beli dengan ukuran yang anda tentukan sebelumnya. Belah ayam dengan bentuk dan kuran yang sedang yang kira-kira cukup untuk satu porsi perorang. \n" +
                "2.\tSetelah ayam dipotong-potong secara merata, lalu masukkan ayam dalam wadah dan ambil ayam ke tempat cucian untuk kemudian ayam akan kita bersihkan. \n" +
                "3.\tBersihkan ayam dibagian luar, perhatikan bila masih terdapat darah yang membeku pada ayam maka buang bagian ini secara merata dengan dibersihkan menggunakan air bersih. \n" +
                "4.\tSetelah itu, dibawah bagian kulit ayam biasanya terdapat kotoran dan lendir yang menempel pada lemak ayam. Bersihkan pula bagian ini dengan menggunakan tangan secara merata dan patikan jika tidak ada kotoran yang masih tersisa.\n" +
                "5.\tSelanjutnya, setelah ayam dibersihkan angkat ayam dan masukkan dalam wadah sebelumnya akan tetapi bersihkan terlebih dahulu baskom tersebut. \n" +
                "6.\tAngkat dan tiriskan air cucian ayam secara merata. Sisihkan dalam wadah dan berikan air jeruk nipis dan garam sedikit bagian saja. Aduk-aduk secara merata dan lumuri. \n" +
                "7.\tSetelah itu, diamkan ayam selama kurang lebih 10 menit agar bumbu yang anda masukkan merata dan bau amis pada ayam bisa dihilangkan. \n" +
                "\n" +
                "Cara Membuat Ayam Goreng Renyah: \n" +
                "1.\tSetelah ayam dibersihkan, selanjutnya silahkan siapkan rebusan air dalam panci atau wajan dengan bentuk yang cekung yang kira-kira bisa menampung ayam untuk diungkep. \n" +
                "2.\tMasukkan ayam kedalamnya bersama dengan daun salam, serai dan juga bumbu yang telah dihaluskan dan berikan sedikit garam. Aduk-aduk secara merata dan ungkep secara merata sampai ayam menjadi setengah matang. \n" +
                "3.\tBerikan pula gula, penyedap dan aduk-aduk lalu masak kembali hingga ayam matah dan kuah menyusut secara merata. \n" +
                "4.\tSelanjutnya angkat ayam, dan sisihkan sementara untuk selanjutnya akan kita goreng.\n" +
                "5.\tSiapkan wajan diatas kompor dan berikan minyak goreng kedalamnya. Gunakan api sedang dan goreng ayam kedalamnya hingga matang dan berwarna kecoklatan.\n","ayam,daun,serai,penyedap,garam,gula,lengkuas,bawang,kunyit,jahe,kemiri,ketumbar" ));
        exampleList.add(new ExampleItem("Resep Ayam Goreng Balado Merah Khas Padang","https://selerasa.com/wp-content/uploads/2015/12/Ayam-goreng-balado-merah.jpg","Bahan-Bahan yang Dibutuhkan\n" +
                "\n" +
                "500 gram daging ayam \n" +
                "1 buah jeruk nipis\n" +
                "\n" +
                "Bumbu-Bumbu Ayam Goreng\n" +
                "\n" +
                "4 siung bawang putih \n" +
                "1 sendok teh garam \n" +
                "1 sdt ketumbar \n" +
                "4 siung bawang merah \n" +
                "1 ruas kunyit \n" +
                "1 cm jahe\n" +
                "\n" +
                "Bumbu Untuk Balado\n" +
                "\n" +
                "3 cabai keriting \n" +
                "3 buah cabai merah \n" +
                "1 sendok teh garam\n" +
                "1 sendok makan gula merah sisir \n" +
                "Minyak goreng secukupnya\n" +
                "10 buah cabai rawit merah \n" +
                "1 sendok makan gula pasir\n" +
                "2 siung bawang putih\n" +
                "Cara Menyiapkan Bahan-Bahan\n" +
                "\n" +
                "1.\tSetelah semua bahan tersedia, anda bisa menyiapkan agar siap olah. Langkah pertama, anda bisa membersihkan ayam yang sudah anda siapkan. Silahkan potong-potong ayam yang sudah anda siapkan dengan ukuran sesuai selera. Kemudian ambil daun jeruk nipis dan lumuri ayam dengan daun jeruk nipis hingga merata. Diamkan selama kurang lebih 10 menit. Jika sudah, bersihkan ayam di bawah air mengalir hingga benar-benar bersih. Kemudian tiriskan terlebih dahulu.\n" +
                "2.\tLangkah selanjutnya, haluskan semua bumbu ungkep yang sudah anda siapkan seperti yang sudah dijelaskan di atas. Anda bisa menghaluskannya dengan menggunakan blender agar lebih praktis. Namun, jika tidak ada anda bisa menghaluskan dengan cara diulek menggunakan cobek dan ulekan seperti biasa.\n" +
                "3.\tKemudian, ungkep ayam yang sudah dibersihkan dengan menggunakan bumbu ungkep yang sudah anda buat tadi.\n" +
                "4.\tTuangkan air secukupnya saja. Lalu anda bisa memasaknya hingga matang. Masak dengan menggunakan api sedang saja.\n" +
                "5.\tSetelah matang, matikan kompor dan anda bisa melanjutkan pada langkah berikutnya.\n" +
                "\n" +
                "Cara Membuat Ayam Goreng Bumbu Balado Merah\n" +
                "\n" +
                "1.\tSetelah ayam selesai diungkep, anda bisa langsung menggorengnya. Silahkan tuangkan minyak goreng ke dalam wajan secukupnya saja. Tunggu hingga minyak goreng panas atau meletup-meletup.\n" +
                "2.\tSetelah itu, masukan ayam dan goreng hingga matang atau berubah warna menjadi kecoklatan. Jika sudah seperti itu, anda bisa mengangkat dan meniriskannya.\n" +
                "3.\tHaluskan semua bumbu balado yang sudah anda siapkan hingga halus. Jika anda pecinta pedas, anda bisa menambahkan cabai sesuai selera.\n" +
                "4.\tKemudian tuangkan kembali minyak goreng secukupnya ke dalam wajan untuk menumis dan biarkan hingga panas. Lalu tumis bumbu balado sampai matang dan mengeluarkan aroma harum. Masukan ayam yang sudah digoreng ke dalam tumisan bumbu. Aduk sampai bumbu merata dengan ayam.\n" +
                "5.\tAngkat ayam dan sajikan pada piring saji yang sudah anda siapkan.\n" +
                "6.\tAyam goreng balado sudah selesai dibuat. Kini anda bisa menyajikannya di tengah keluarga. Agar makan lebih berselera anda bisa melengkapinya dengan lauk pauk tambahan atau lalapan\n","ayam,jeruk,bawang,garam,ketumbar,kunyit,jahe" ));
        exampleList.add(new ExampleItem("Pecak Lele","https://selerasa.com/wp-content/uploads/2015/10/images_ikan_ikan-lele-pecak.jpg","Bahan- Bahan\n" +
                "\n" +
                "Lele bersihkan kemudian goreng\n" +
                "Cabai merah besar iris serong\n" +
                "Cabai Hijau besar iris serong\n" +
                "Tomat hijau belah empat\n" +
                "Tomat merah belah empat\n" +
                "Santan\n" +
                "\n" +
                "Bumbu Halus\n" +
                "\n" +
                "Bawang putih\n" +
                "Bawang merah\n" +
                "Kemiri\n" +
                "\n" +
                "Penyedap\n" +
                "\n" +
                "Jahe geprek\n" +
                "Lengkuas geprek\n" +
                "Daun salam geprek\n" +
                "Garam\n" +
                "Penyedap rasa\n" +
                "Gula\n" +
                "\n" +
                "Langkah\n" +
                "\n" +
                "1.\tPanaskan minyak untuk menumis bumbu yang dihaluskan, Tumis sampai harum dan berubah warna menjadi kuning keemasan, tambahkan daun salam, lengkuas, dan jahe dan cabai, setelah harum tambahkan santan\n" +
                "2.\tMasukkan lele yang sudah di goreng, bumbui dengan garam dan penyedap juga gula\n" +
                "3.\tMasak sampai air agak menyusut, tambahkan tomat, masak kembali, koreksi rasa dan sajikan\n","lele,cabai,tomat,santan,bawang,kemiri,jahe,daun,gula,penyedap" ));
        exampleList.add(new ExampleItem("Mie hun goring","https://i1.wp.com/notepam.com/wp-content/uploads/2017/11/Resep-Bihun-Goreng-Jawa.jpg?resize=680%2C350&ssl=1","Bahan-Bahan:\n" +
                "\n" +
                "250 gr mie hun kering (rendam air panas, tiriskan)\n" +
                "100 gr bakso ikan (sesuai selera)\n" +
                "1/2 ikat sawi manis (potong-potong)\n" +
                "1 buah wortel (serut kasar/potong korek)\n" +
                "2 butir telur (kocok lepas, beri sedikit garam)\n" +
                "4 sdm saus tiram\n" +
                "Secukupnya kecap manis\n" +
                "Secukupnya garam\n" +
                "Secukupnya merica (optional, krn cabe udah cukup pedas)\n" +
                "2 batang daun bawang (potong2)\n" +
                "Secukupnya daun seledri\n" +
                "\n" +
                "Bumbu halus:\n" +
                "\n" +
                "6 siung bawang merah\n" +
                "4 siung bawang putih\n" +
                "4 butir kemiri\n" +
                "6-8 buah cabe merah keriting (sesuai selera)\n" +
                "1/2 buah tomat besar (atau 1 bh tomat sedang)\n" +
                "Sedikit minyak untuk blender\n" +
                "\n" +
                "Langkah:\n" +
                "1.\tRendam mie hun kering dengan air panas, setelah lembut, tiriskan\n" +
                "2.\tBlender bumbu halus, sisihkan\n" +
                "3.\tPanas kan wajan, beri minyak sedikit (karena bumbu halus sudah diblender dengan minyak), tumis bumbu halus\n" +
                "4.\tMasukkan 2sdm saus tiram, aduk rata, masukkan sebagian potongan daun bawang. Kemudian masukkan telur (bumbu tumis agak di sisihkan ke tepi wajan untuk membuat telur orak-arik) setelah telur matang/bergumpal aduk rata dengan bumbu tumis\n" +
                "5.\tMasukkan sisa saus tiram, beri garam, merica dan kecap, aduk rata\n" +
                "6.\tMasukkan bakso ikan, wortel dan sawi, aduk sampai agak layu\n" +
                "7.\tMasukkan mie hun, aduk2 sampai bumbu rata, koreksi rasa (bisa tambahkan kecap manis, garam atau merica)\n" +
                "8.\tMasak mie hun sampai rata, bumbu meresap dan mie lembut.\n" +
                "9.\tMatikan api, masukkan irisan daun selerdri dan daun bawang\n" +
                "10.\tMie hun goreng siap di sajikan dengan pelengkap kerupuk, ayam suir, bawang goreng dll.\n","mie,bakso,ikan,hun,buah,butir,kecap,merica,bawang,cabe,tomat" ));
        exampleList.add(new ExampleItem("Bebek Goreng Madura","https://img-global.cpcdn.com/003_recipes/e3e4c3d1312ec013/751x532cq70/bebek-goreng-madura-foto-resep-utama.jpg","Bahan-bahan\n" +
                "\n" +
                "1 ekor bebek, cuci bersih lalu lumuri dengan cuka\n" +
                "15 siung bawang merah\n" +
                "10 siung bawang putih\n" +
                "2 kemiri\n" +
                "1 sdm ketumbar\n" +
                "1 ruas kunir\n" +
                "Garam\n" +
                "Gula\n" +
                "8 daun salam\n" +
                "5 daun jeruk\n" +
                "4 sereh\n" +
                "Air\n" +
                "\n" +
                "Langkah\n" +
                "\n" +
                "1.\tCuci kembali bebek supaya cukanya hilang\n" +
                "2.\tHaluskan semua bumbu lalu sisihkan\n" +
                "3.\tSiapkan panci presto lalu tata bebek beri bumbu halus dan semua rempah2 lalu beri air kira2 seluruh permukaan bebek tertutup\n" +
                "4.\tTutup rapat panci presto lalu presto selama kurang lebih 1 jam\n" +
                "5.\tSetelah 1 jam bebek siap untuk digoreng\n","bebek,siung,bawang,ketumbar,kunir,daun,sereh" ));
        exampleList.add(new ExampleItem("Tahu Goreng Renyah Khas Sumedang","http://www.resepharian.com/wp-content/uploads/2015/07/Resep-Tahu-Goreng-Renyah-Khas-Sumedang.jpeg","Tahu Goreng Renyah Khas Sumedang\n" +
                "Bahan-Bahan\n" +
                "\n" +
                "Tahu putih 10 buah, atau bisa juga tahu sumedang\n" +
                "Telur 1 butir\n" +
                "Tepung terigu 80 gram\n" +
                "Baking powder 1/4 sdt\n" +
                "Bawang merah 3 butir, haluskan\n" +
                "Bawang putih 3 siung, haluskan\n" +
                "Kunyit 2 cm, haluskan\n" +
                "Penyedap rasa 1 sendok makan\n" +
                "Garam halus 1 sendok teh\n" +
                "Minyak goreng, secukupnya\n" +
                "Air putih bersih secukupnya, untuk merendam\n" +
                "\n" +
                "Langkah \n" +
                "\n" +
                "1.\tGunakan wadahan untuk mencampur bahan tepung terigu, baking powder, penyedap rasa, dan garam halus, aduk-aduk hingga bahan tercampur semua, sisihkan\n" +
                "2.\tKemudian wadah baru untuk mencampur bahan yang sudah dihaluskan dengan air, dan aduk hinggga tercampur semua dan rata\n" +
                "3.\tJadikan tahu menjadi 4 bagian bila tahu terlalu besar, kemudian masukan tahu yang sudah dipotong kedalam adonan air yang sudah dibumbui, tiriskan kurang lebih 10 menit atau lebih kalau ingin bumbu lebih meresap\n" +
                "4.\tSiapkan telur yang sudah dikiocok tadi, dan celupkan satu persatu tahunya ke dalam telur kocok\n" +
                "5.\tLalu langsung masukan tahu kedalam adonan tepung yang sudah dibuat, sambil di gelinding-gelinding agar tahu terbalut tepung, lakukan sampai habis\n" +
                "6.\tKemudian gorenglah tahu yang sudah terbalut tepung tadi dengan menggunakan api yang besar, agar kematangan tahu lebih maksimal, tunggu sampai tahu matang dan berubah warna agak kecoklatan\n" +
                "7.\tAngkat dan sajikan tahu sumedang selagi angat-angat, agar lebih nikmat\n","tahu,telur,tepung,baking,bawang,kunyit" ));
        exampleList.add(new ExampleItem("Sambel Goreng Ati Sapi","https://img-global.cpcdn.com/003_recipes/46b98e7255b36722/751x532cq70/sambal-goreng-ati-sapi-kentang-foto-resep-utama.jpg","Bahan-Bahan\n" +
                "\n" +
                "400g hati sapi, potong dadu 3 cm, sangrai\n" +
                "200g kentang, kupas, potong dadu 2 cm, goreng\n" +
                "2lembar daun salam\n" +
                "3cm lengkuas, memarkan\n" +
                "1batang serai, memarkan, simpulkan\n" +
                "3lembar daun jeruk\n" +
                "5buah cabai merah, buang biji, iris serong\n" +
                "750ml santan encer\n" +
                "1bungkus Royco Kaldu Sapi\n" +
                "2sdt gula merah, sisir\n" +
                "5sdm minyak, untuk menumis\n" +
                "\n" +
                "Langkah\n" +
                "\n" +
                "1.\tPanaskan minyak, tumis bumbu halus, daun salam, lengkuas, serai, daun jeruk dan cabai hingga matang dan harum.\n" +
                "2.\tMasukkan hati sapi dan kentang, aduk rata. Tambahkan santan, Royco Kaldu Sapi, dan gula merah, aduk rata.\n" +
                "3.\tMasak hingga matang dan bumbu meresap. Angkat\n" +
                "4.\tSajikan hangat disertai nasi.\n","sapi,hari,kacang,lengkuas,serai" ));

        /*Kukus
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/

        /*Padang
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/

        /*Panggang
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/

        /*Rebus
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/

        /*Semarang
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/

        /*Sunda
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));
        exampleList.add(new ExampleItem("","","","" ));*/


        /*exampleList.add(new ExampleItem("https://cdn.idntimes.com/content-images/post/20180928/e6c990958b5806e5399bc48467af1a11.png", "Judul", "deskripsi","kategori"));
        exampleList.add(new ExampleItem("https://cdn.idntimes.com/content-images/post/20180928/e6c990958b5806e5399bc48467af1a11.png", "Judul", "deskripsi","kategori"));
        exampleList.add(new ExampleItem("https://cdn.idntimes.com/content-images/post/20180928/e6c990958b5806e5399bc48467af1a11.png", "Judul", "deskripsi","kategori"));*/
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        adapter = new ExampleAdapter(this,exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}