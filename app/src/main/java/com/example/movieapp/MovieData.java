package com.example.movieapp;

import java.util.ArrayList;

public class MovieData {
    public static String[][] data = new String[][]{
            {"https://cdn.cgv.id/uploads/movie/compressed/19029600.jpg","JOKER","Joaquin Phoenix, Robert De Niro, Zazie Beetz","Todd Phillips","CRIME","122","An original standalone origin story of the iconic villain not seen before on the big screen, it's a gritty character study of Arthur Fleck, a man disregarded by society, and a broader cautionary tale."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19030200.jpg","ABOMINABLE","Chloe Bennet, Tenzing Norgay Trainor, Albert Tsai, Eddie Izzard","odd Wilderman, Jill Culton","ANIMATION","97","When teenage Yi (Chloe Bennet) encounters a young Yeti on the roof of her apartment building in Shanghai, she and her mischievous friends Jin (Tenzing Norgay Trainor) and Peng (Albert Tsai) name him “Everest” and embark on an epic quest to reunite the magical creature with his family at the highest point on Earth. But the trio of friends will have to stay one-step ahead of Burnish (Eddie Izzard), a wealthy man intent on capturing a Yeti, and zoologist Dr. Zara (Sarah Paulson) to help Everest get home."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19031800.jpg","WAR","Hrithik Roshan, Tiger Shroff, Vaani Kapoor","Siddharth Anand","ACTION","154","The film follows an Indian soldier who is assigned to eliminate his former mentor, who had gone rogue."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19030700.jpg","NE ZHA","oseph, Mo Han, Hao Chen, Qi Lü, Jiaming Zhang, Wei Yang","Jiao Zi","ANIMATION","110","Nezha adalah mitologi Tiongkok yang sangat terkenal, sama halnya seperti mitologi Sun Wukong. Dalam mitologi ini, diceritakan bahwa ibunda Nezha, Lady Lin, melahirkan seorang manusIa berbentuk bola setelah mengandung selama 3 tahun 6 bulan, Ayahnya, Li Jing, menyangka bahwa istrinya telah melahirkan seorang iblis dan menyerang bola tersebut dengan pedangnya.\n" +
                    "Bola terbelah dan keluarlah Nezha, anak laki-laki yang dapat langsung berjalan dan berbicara. Na Zha disembah dalam suatu agama rakyat Tiongkok. Film ini dimulai dengan aura dari Surga dan Bumi bertemu dan terciptalah sebuah mutiara yang mempunyai kekuatan dahsyat. Yuanshi Tianzun (Dewa Surga) memisahkan mutiara tersebut ke dalam dua pil - Pil Spiritual dan Pil Iblis. Pil Spiritual akan menjelma menjadi seorang lelaki yang ditakdirkan untuk membawa dinasti Zhou baru. Sedangkan Pil Iblis akan melahirkan seorang iblis yang dapat menghancurkan dunia. Oleh karena itu Yuanshi Tianzun menciptakan sebuah mantera pemanggil petir yang akan menghancurkan Pil Iblis dalam 3 tahun"},
            {"https://cdn.cgv.id/uploads/movie/compressed/19027900.jpg","ABIGAIL","Tinatin Dalakishvili, Eddie Marsan, Rinal Mukhametov","Aleksandr Boguslavskiy","FANTASY","110","Kota yang ditinggali ABIGAIL menutup diri selama bertahun-tahun karena wabah penyakit misterius. Abigail masih kecil saat ayahnya dibawa pergi karena terjangkit penyakit. Namun, suatu hari, Abigail mengetahui kalau ternyata dia punya kekuatan spesial dan kota yang dia tinggali ternyata penuh dengan sihir. Akhirnya, dia paham kalau wabah penyakit yang ada di kota itu hanyalah kebohongan. Itu hanyalah kedok yang dibuat-buat oleh pemerintah kota agar bisa memenjarakan orang-orang yang memiliki kekuatan sihir. Abby menduga ayahnya masih hidup. Jadi, dia berniat untuk mencarinya. Dia mencoba melawan dan akhirnya diburu oleh inspektur Departemen Keamanan. Para pemberontak dari gerakan bawah tanah untuk membebaskan kota juga membantu Abby untuk menghindar dari kejaran Departemen Keamanan. Tujuan utama Abby adalah menemukan ayahnya, namun dia harus menghadapi banyak tantangan dan petualangan menegangkan. Perjalanan Abigail akan membuatnya mengetahui hal-hal baru tentang diri nya sendiri dan dunia sihir."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19031000.jpg","GEMINI MAN","Will Smith, Mary Elizabeth Winstead, Clive Owen, Benedict Wong","Ang Lee","ACTION","117","An over-the-hill hitman faces off against a younger clone of himself."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19030800.jpg","GOOD BOYS","Jacob Tremblay, Keith L. Williams, Brady Noon, Molly Gordon","Gene Stupnitsky","COMEDY","90","Three 6th grade boys ditch school and embark on an epic journey while carrying accidentally stolen drugs, being hunted by teenage girls, and trying to make their way home in time for a long-awaited party."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19025400.jpg","THE ANGRY BIRDS MOVIE 2","Jason Sudeikis, Josh Gad, Leslie Jones, Bill Hader, Rachel Bloom","Thurop Van Orman, John Rice","ANIMATION","97","When a new threat emerges that puts both Bird and Pig Island in danger, Red, Chuck, Bomb, and Mighty Eagle recruit Chuck’s sister Silver and team up with pigs Leonard, his assistant Courtney, and techpig Garry to forge an unsteady truce and form an unlikely superteam to save their homes"},
            {"https://cdn.cgv.id/uploads/movie/compressed/19025700.jpg","TERRA WILLY","Timothé Vom Dorp, Edouard Baer, Marie-Eugénie Maréchal","Éric Tosti","ANIMATION","89","From 6 years old, following the destruction of their ship, the young Willy is separated from his parents with whom he traveled in space. His spare capsule lands on a wild and unexplored planet. With the help of Buck, a survival robot, he will have to hold until the arrival of a rescue mission. In the meantime, Willy, Buck and Flash, an alien creature with whom they befriended, set out to discover the planet, its fauna, its flora ... but also its dangers."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19024300.jpg","BALI: BEATS OF PARADISE","Judith Hill, Nyoman Wenten, Livi Zheng, Nanik Wenten, Balawan","Livi Zheng","Others","56","Bali: Beats of Paradise menampilkan Artis Pemenang Grammy Award Judith Hill (Pemenang Oscar- 20 Feet from Stardom) dan komposer Indonesia Nyoman Wenten. Selama 40 tahun terakhir Nyoman Wenten telah mengabdikan hidupnya untuk mengajar. Saat ini mengajar di departemen Etnomusikologi di UCLA Herb Alpert School of Music dan sekolah musik California Institute of The Arts. Musik gamelan telah menyebar ke sebagian besar negara bagian di AS, tetapi sayangnya mulai menurun di tanah air. Wenten ingin meninggalkan sesuatu yang istimewa sebelum beliau pensiun dan kembali ke Bali. Secara kebetulan penyanyi pemenang Grammy, Judith Hill, sedang mencari suara khas untuk musik baru yang sedang ia komposisikan. Dia tertarik dengan musik gamelan dan pergi untuk membahas perpaduan gaya musik. Hill dan Wenten bekerja di studio mengerjakan \"Queen of the Hill\", sebuah lagu yang memadukan musik funk dan gamelan. Mereka memutuskan untuk membuat video klip yang diambil di Joshua Tree Desert, California Selatan. Video klip tersebut adalah kaleidoskop dari musik funk dan tarian tradisional Bali."},
            {"https://cdn.cgv.id/uploads/movie/compressed/19025100.jpg","IT CHAPTER TWO","James McAvoy, Jessica Chastain, Bill Hader, James Ransone","Andy Muschietti","HORROR","170","Twenty-seven years after their first encounter with the terrifying Pennywise, the Losers Club have grown up and moved away, until a devastating phone call brings them back."}
    };

    public static ArrayList<MovieModel> getListData(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for(String[] aData:data){
            MovieModel movie= new MovieModel();
            movie.setPoster(aData[0]);
            movie.setTitle(aData[1]);
            movie.setActors(aData[2]);
            movie.setDirector(aData[3]);
            movie.setGenre(aData[4]);
            movie.setDuration(aData[5]);
            movie.setDetail(aData[6]);

            list.add(movie);
        }
        return list;
    }
}
