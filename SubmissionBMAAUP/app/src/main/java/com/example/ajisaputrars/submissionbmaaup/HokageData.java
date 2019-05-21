package com.example.ajisaputrars.submissionbmaaup;

import java.util.ArrayList;

public class HokageData {

    public static String[][] data = new String[][]{
            {"Hashirama Senju",
                    "Hokage Pertama",
                    "Hashirama Senju (千手柱間, Senju Hashirama) dulunya Hokage Pertama (初代火影, Shodai Hokage Secara harfiah berarti Bayangan Api pertama) dari Konohagakure. Dia terkenal sebagai Dewa Shinobi (忍の神, Shinobi no Kami; TV Bahasa Inggris The Supreme Shinobi)",
                    "https://vignette.wikia.nocookie.net/naruto/images/3/30/Hokage_Hashirama.png/revision/latest?cb=20140406065909&path-prefix=id"
            },

            {"Tobirama Senju",
                    "Hokage Kedua",
                    "Tobirama Senju (千手扉间, Senju Tobirama) adalah anggota dari klan Senju, yang bersama dengan saudara tertuanya serta klan Uchiha, mendirikan desa shinobi pertama.",
                    "https://vignette.wikia.nocookie.net/naruto/images/8/8f/Tobirama_Senju_Muka.png/revision/latest?cb=20160621171438&path-prefix=id"
            },

            {"Hiruzen Sarutobi",
                    "Hokage Ketiga",
                    "Hiruzen Sarutobi (猿飛ヒルゼン, Sarutobi Hiruzen) dahulu adalah Hokage Ketiga (三代目火影, Sandaime Hokage Secara harfiah berarti Bayangan Api Ketiga) dari Konohagakure. Sebagai seorang murid Hokage sebelumnya, Hiruzen adalah seorang ninja yang kuat, dipuji sebagai bayangan api ketiga",
                    "https://vignette.wikia.nocookie.net/naruto/images/e/e4/Hiruzen_Sarutobi.png/revision/latest?cb=20160626113340&path-prefix=id"
            },

            {"Minato Namikaze",
                    "Hokage Keempat",
                    "Minato Namikaze (波風ミナト, Namikaze Minato) dulunya adalah Hokage Keempat (四代目火影, Yondaime Hokage; Secara harfiah berarti bayangan api keempat",
                    "https://vignette.wikia.nocookie.net/naruto/images/1/11/Hokage_Minato.png/revision/latest?cb=20140406070328&path-prefix=id"
            },

            {"Tsunade",
                    "Hokage Kelima",
                    "Tsunade (綱手, Tsunade) adalah salah seorang Sannin dari Konohagakure. Dia mempunyai gelar Tsunade si Putri Siput dari Konoha (木ノ葉のナメクジ綱手姫, Konoha no Namekuji Tsunade-hime)",
                    "https://vignette.wikia.nocookie.net/naruto/images/a/a2/Tsunade_as_Hokage.png/revision/latest?cb=20140406070654&path-prefix=id"
            },

            {"Danzo Shimura",
                    "Hokage Keenam",
                    "Danzō Shimura (志村ダンゾウ, Shimura Danzō) adalah seorang tetua dari Konohagakure. Sebagai pendiri dan pemimpin Akar, Danzō menjadi terkenal sebagai Shinobi Kegelapan ",
                    "https://vignette.wikia.nocookie.net/naruto/images/2/24/Danzo_as_hokage.png/revision/latest?cb=20141019193339&path-prefix=id"
            },

            {"Hatake Kakashi",
                    "Hokage Keenam",
                    "Kakashi Hatake (はたけカカシ, Hatake Kakashi) adalah shinobi Konohagakure dari klan Hatake. Terkenal sebagai Kakashi si Sharingan (写輪眼のカカシ, Sharingan no Kakashi), dia adalah salah satu ninja Konoha yang paling berbakat",
                    "https://vignette.wikia.nocookie.net/naruto/images/a/a1/Kakashi_hokage.png/revision/latest?cb=20150523144033&path-prefix=id"
            },

            {"Naruto Uzumaki",
                    "Hokage Ketujuh",
                    "Naruto Uzumaki (うずまきナルト, Uzumaki Naruto) adalah shinobi dari klan Uzumaki Konohagakure. Dia menjadi jinchūriki Ekor-Sembilan pada hari kelahirannya — nasib yang menyebabkan dia dijauhi oleh sebagian besar Konoha sepanjang masa kecilnya. Setelah bergabung dengan Team Kakashi, Naruto bekerja keras untuk mendapatkan pengakuan desa sambil mengejar mimpinya untuk menjadi Hokage. ",
                    "https://vignette.wikia.nocookie.net/naruto/images/5/57/Naruto_Boruto_Movie.png/revision/latest?cb=20150523144101&path-prefix=id"
            }
    };

    public static ArrayList<Hokage> getListData(){
        Hokage hokage = null;
        ArrayList<Hokage> list = new ArrayList<>();
        for (String[] aData : data) {
            hokage = new Hokage();
            hokage.setName(aData[0]);
            hokage.setRemarks(aData[1]);
            hokage.setDescription(aData[2]);
            hokage.setPhoto(aData[3]);

            list.add(hokage);
        }

        return list;
    }
}
