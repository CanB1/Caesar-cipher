public class SezarSifreleme {

    public String metin;
    public char[] karakterler;

    public void metniDuzenle(String metin){
        metin = metin.trim(); //Kullanıcının girdiği metinin başında ve sonundaki boşlukları silme
        StringBuilder sb = new StringBuilder(metin);
        for (int i = 0; i < sb.length() ; i++) {
            if (sb.charAt(i) == ' ' && sb.charAt(i+1) == ' '){
                sb.deleteCharAt(i); //Eğer boşluktan sonra bir boşluk daha varsa silme.Böylece metin normal hale gelecektir.
                i--;
            }
        }
        karakterler = new char[sb.length()];
        for (int i = 0; i <sb.length() ; i++) {
            karakterler[i] = sb.charAt(i); /*Metnin tüm karakterlerini bir karater dizisine aktardım.Böylece istediğim
                                           koşula göre metnin karakterlerini değiştirebilirim*/
        }

    }

    public String sifrele(){
        metin ="";
        int ascii = 0;
        for (int i = 0; i <this.karakterler.length ; i++) {
            ascii = (int) karakterler[i]; //Karakterleri int türünde değiştirerek ascii kodlarını alma
            if ((ascii>=65 && ascii <=90) || (ascii>=97 && ascii <= 122)) { // Bu aralık alfabenin ascii aralığı
                ascii += 7;
                if ((ascii > 90 && ascii <=97)||(ascii >122 && ascii <= 129)){ //Eğer ascii kodu alfabeyi geçerse  başa döndürme
                    ascii -= 26;
                }
                karakterler[i] = (char) ascii; //ascii kodunu char a dönüştürüp yeni karakter olarak atama
            }
            if (ascii >= 48 && ascii <= 57){//Bu aralık rakamların ascii aralığı
                ascii +=7;
                if (ascii >57){ //Eğer ascii kodu rakamları geçerse başa döndürme
                    ascii -= 10;
                }
                karakterler[i] = (char) ascii;
            }
        }
        for (int i = 0; i < karakterler.length ; i++) {
            metin += "" + karakterler[i]; //Karakterleri tek bir metine dönüştürme
        }
        return metin;
    }

    public String sifreCoz(){
        metin ="";
        int ascii = 0;
        for (int i = 0; i <this.karakterler.length ; i++) {
            ascii = (int) karakterler[i]; //Karakterleri int türünde değiştirerek ascii kodlarını alma
            if ((ascii>=65 && ascii <=90) || (ascii>=97 && ascii <= 122)) {
                ascii -= 7;
                if ((ascii < 65 && ascii >= 58)||(ascii <97 && ascii >=90)){//Eğer ascii kodu alfabenin altına düşerse başa döndürme
                    ascii += 26;
                }
                karakterler[i] = (char) ascii;
            }
            if (ascii >= 48 && ascii <= 57){
                ascii -=7;
                if (ascii < 48){ //Eğer ascii kodu rakamların altına düşerse başa döndürme
                    ascii += 10;
                }
                karakterler[i] = (char) ascii;
            }
        }
        for (int i = 0; i < karakterler.length ; i++) {
            metin += "" + karakterler[i];
        }
        return metin;
    }




}
