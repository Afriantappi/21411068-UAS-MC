package com.example.uas_mc_afrian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KontenActivity : AppCompatActivity() {
    private lateinit var BookRecyclerView: RecyclerView
    private lateinit var BookList : ArrayList<Book>
    private lateinit var BookAdapter : BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konten)

        BookList = ArrayList()

        BookList.add(
            Book(R.drawable.book1, "puncak ilmu adalah akhlak",
                "Hari ini kita menyaksikan keringnya adab dan akhlak di dalam berbagai potret berita yang tersiar. Ada anak didik yang berani melawan gurunya, bahkan membantah nasihatnya secara terang terangan di muka umum. Ada pula murid yang tidak terima karena ditegur guru, kemudian melaporkan gurunya ke polisi. Ada pula sekelompok murid yang berani mengeroyok guru sehingga luka parah.\n" +
                        "\n" +
                        "Kenapakah mereka tidak menunjukkan adab dan akhlak yang mulai? Tidak ingin menyalahkan hanya sepihak saja, saya menyarankan kita untuk meninjau kembali sistem pendidikan kita dan cita cita yang ingin kita bangun lewat pendidikan tersebut. Adakah kita sudah mengedepankan adab dan akhlak? Atau tidak cenderung mengutamakan ilmu, sembari melupakan pentingnya adab dan akhlak?\n" +
                        "\n" +
                        "Saudaraku, belum terlambat untuk berubah dan berbenah. Mulai dari diri kita sendiri, mari menghias diri dengan adab dan akhlak. Sebab orang yang bisa memuliakan orang lain dengan adab dan akhlaknya, mereka itulah orang orang yang mulai.\n" +
                        "\n" +
                        "Buku Puncak Ilmu Adalah Akhlak ini akan memberikan penjelasan terkait hal – hal yang harus kita ketahui agar kita bisa menunjukkan akhlak terpuji, yaitu akhlak kepada Allah Swt., Rasulullah saw., Al-Qur’an, agama Islam, orang tua, keluarga, guru, saudara dan tetangga. Selain itu, juga seharusnya bagaimana akhlak dalam peran – peran kita di keseharian dalam bekerja, berniaga dan juga memimpin.\n")
        )

        BookList.add(
            Book(R.drawable.book2, "semua orang butuh curhat",
                "“Ini adalah buku yang berani, menyenangkan, dan transformatif.”\n" +
                        "Arianna Huffington\n" +
                        "Pendiri Huffington Post dan Pendiri & CEO Thrive Global\n" +
                        "\n" +
                        "“Bijaksana, hangat, cerdas, dan lucu. Anda harus membaca buku ini.”\n" +
                        "—Susan Cain\n" +
                        "penulis Quiet, buku terlaris menurut New York Times\n" +
                        "\n" +
                        "Ketika krisis pribadi menyebabkan dunianya runtuh, Lori Gottlieb—terapis berpengalaman dengan praktik yang berkembang pesat di Los Angeles— tiba-tiba kehilangan arah. Lalu datanglah Wendell, terapis veteran dengan gaya yang tidak biasa, yang membantu Gottlieb dengan sesi terapi yang terbukti transformatif.\n" +
                        "\n" +
                        "Ketika menjelajahi ruang dalam kehidupan pasiennya—seorang produser Hollywood yang egois, seorang pengantin baru yang didiagnosis menderita penyakit ganas, seorang warga senior yang mengancam akan mengakhiri hidup di hari ulang tahunnya jika hidupnya tidak menjadi lebih baik, dan\n" +
                        "seorang wanita berusia dua puluhan tahun yang tidak bisa berhenti bergaul dengan orang yang salah—Gottlieb menemukan bahwa pertanyaan yang menjadi ajang pergulatan mereka adalah pertanyaan yang sekarang dia ajukan kepada Wendell.\n" +
                        "\n" +
                        "Dengan gaya bercerita yang ringan, Gottlieb mengundang kita ke dunianya, baik sebagai terapis maupun pasien, memeriksa kebenaran dan ilusi yang kita ceritakan pada diri sendiri dan orang lain ketika kita berjalan di atas benang yang tipis antara cinta dan hasrat, makna dan kematian, rasa bersalah dan penebusan, teror dan keberanian, serta harapan dan perubahan.\n")
        )

        BookList.add(
            Book(R.drawable.book3, "menggapai proses",
                "Sebuah proses perjalanan menulis bagi setiap orang memiliki tahapan dan kesulitannya masing-masing. Zona waktu yang berbeda membuatnya sabar dengan pembelajaran. Bukan untuk dikeluhkan, tetapi dikembangkan. Persaingan di era digital ini semakin ketat, menandakan semangat kompetisi semakin besar adanya. Bukan kendor, melainkan mencari celah kesempatan emas.\n" +
                        "\n" +
                        "Zona nyaman, itulah yang harus dikenali oleh setiap penulis. Tepatnya, bisa keluar dari zona nyaman. Setiap penulis memiliki zona yang membuatnya nyaman untuk tidak produktif, stagnan begitu saja. Ada Beberapa kawan rajin menuliskan banyak hal, tetapi dia malu untuk keluar dari zonanya. Dalam artian, hasilnya tidak dikembangkan, tidak dikritik ataupun diperbaiki. Hanya sekedar senang menulis.\n" +
                        "\n" +
                        "Kesempatan seperti ini, sangat disayangkan karena rasa senangnya sebatas tertuangkan dalam goresan tangan dalam peti. Cobalah untuk maju satu langkah, yaitu berani mengembangkan. Cari ladang sesuai dengan fashion, bukan menanti bola. Percaya pada kemampuan diri, dia akan membuktikan dengan sebuah karya hebat. Yakinlah, semua indah dengan sebuah proses.\n")
        )

        BookList.add(
            Book(R.drawable.book4, "sabar",
                "Sudah sejak zaman bermula, cerita selalu menjadi sarana yang dahsyat sebagai pengantar hidayah. Tak perlu heran pula melihat kenyataan bahwa di dalam Al-Qur`an, bagian terbesarnya adalah kisah dan sejarah. Pada setiap kisah selalu sarat dengan makna tak berhingga, meluruskan yang salah dan mengokohkan yang benar.\n" +
                        "\n" +
                        "Hari ini, di tengah pusaran hidup yang berjalan tergesa-gesa, mungkin ada banyak hikmah terserak yang kita abaikan. Padahal, sejatinya jika kita sudi berhenti sejenak, ada banyak cerita yang bisa kita ambil pelajaran sehingga bisa memperkaya jiwa juga menambah rasa syukur dalam jiwa.\n" +
                        "\n" +
                        "Di dalam buku ini ada banyak kisah yang sarat akan makna. Cerita-ceritanya berupa kisah fiksi dari berbagai referensi maupun kisah nyata yang terpapar dalam lembar kehidupan manusia teladan seperti Rasulullah, para Sahabat, Salafush saleh, dan masih banyak lagi. Yang kesemuanya insya Allah memberikan hikmah.\n" +
                        "\n" +
                        "Buku ini sangat cocok dibaca di saat merasa insecure, sedih, galau, juga perasaan negative lain yang sedang dirasakan. Dengan membaca kisah-kisah di dalamnya kita akan mendapat banyak insight sehingga bisa lebih menerima kondisi diri, memiliki harapan serta pemahaman bahwa Allah sangat menyayangi hamba-Nya. Yakin saja, Dia benar-benar mempersiapkan yang terbaik untuk kita.\n")
        )


        BookRecyclerView = findViewById(R.id. BookRecyclerView)
        BookRecyclerView.setHasFixedSize(true)
        BookRecyclerView.layoutManager = LinearLayoutManager(this)

        BookAdapter =  BookAdapter(BookList)
        BookRecyclerView.adapter = BookAdapter
        BookAdapter.onItemClick = {

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Book", it)
            startActivity(intent)
        }
    }
}
