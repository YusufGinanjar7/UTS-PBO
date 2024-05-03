# Ujian Akhir Semester
<br>Mata Kuliah   : Praktikum Pemograman Berorientasi Objek
<br>Nama           : Yusuf Ginanjar
<br>NIM            : 1227050136
<br>Jurusan        : [Teknik Informatika](http://if.uinsgd.ac.id/) [UIN Sunan Gunung Djati Bandung](https://uinsgd.ac.id/)

## Deskripsi Umum
program yang didalamnya terdapat seluruh konsep PBO yang sudah dipelajari diantaranya terdapat :

<br> 1. Encapsulation
<br> 2. Inheritance
<br> 3. Polimorphism
<br> 4. Interface atau Abstract
Dibuat sesuai kriteria diatas dan minimal terdapat tiga class didalamnya, 
jika sudah selesai silahkan anda simpan dalam repository (dapat disimpan pada github masing-masing atau pada google drive) 
didalamnya terdapat kode program dan screenshot disertai penjelasan dari program sederhana yang telah dibuat.Z

## Source Code
```
    interface Tipe{
    void genre();
}
abstract class Game implements Tipe{
    private String nama;

    public game(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
}

class Tembakan extends Game {
    private String nama;
    public Tembakan(String nama){
        this.nama = nama;
    }
    @Override
    public void genre(){
        System.out.println(nama + " game ini bertipe tembakan.");
    }
    // @Override
    // public String getType(){
    //     return nama;
    // }
}

class Balapan extends Game {
    private String nama;
    public Balapan(String nama){
        this.nama = nama;
    }
    @Override
    public void genre(){
        System.out.println(nama + " game bertipe balapan liar.");
    }
    // @Override
    // public String getType(){
    //     return nama;
    // }
}

public class Main {
    public static void main(String[] args){
        Game tembakan = new Tembakan("PUBG");
        Game balapan =  new Balapan("Need More Speed");

        tembakan.genre();
        balapan.genre();
    }
} 
```
## Output 
  <img src="Screenshot 202024-05-03 20202751.png" />
