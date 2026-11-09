# Rapor

**Ad Soyad:** Muhammed Doruk Karataş
**Numara:** 93

## 1. Problem Analizi
<!-- Problemi kendi cümlelerinizle yazın. -->
1-Kullanıcı doğru ve yanlış sayısını girer.
2-Sayılar geçersizse bilgisayar geçersiz çıktısını verir.
3-Bilgisayar net ve boş sayısını hesaplar.
4-Bilgisayar nete göre çıktı verir.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-dogru,yanlis

**İşlemler:**
-girdi alma , işlem yapma,çıktı verme

**Çıktılar:**
-iyi,kotu,orta,cok iyi

## 3. Matematiksel Formüller
+
-
/
-

## 4. Sözde Kod (Pseudocode)
BASLA
    YAZDIR "dogru sayisini giriniz"
    OKU dogru
    YAZDIR "yanlis sayinizi giriniz"
    OKU yanlis

    EĞER (dogru + yanlis > 20) VEYA (dogru < 0) VEYA (yanlis < 0) İSE
        YAZDIR "girdiginiz sayi gecersiz"
    DEĞİLSE
        bos = 20 - (dogru + yanlis)
        net = dogru - (yanlis / 4.0)

        EĞER net >= 0 VE net <= 5 İSE
            YAZDIR 20, dogru, yanlis, bos, net, "kotu"
        DEĞİLSE EĞER net > 5 VE net <= 10 İSE
            YAZDIR 20, dogru, yanlis, bos, net, "orta"
        DEĞİLSE EĞER net > 10 VE net <= 15 İSE
            YAZDIR 20, dogru, yanlis, bos, net, "iyi"
        DEĞİLSE EĞER net > 15 VE net <= 20 İSE
            YAZDIR 20, dogru, yanlis, bos, net, "cok iyi"
        BİTİR_EĞER
    BİTİR_EĞER
BİTİR
## 5. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 6. Başarı Durumu Koşulları
<!-- Koşulları hangi sırayla ve hangi operatörlerle yazdığınızı, nedenini açıklayın. -->
sayı geçersizse if iki durum vardır geçerli olmak ve olmamak
if 0 la 5 arasında olup olmadığına göre yol belirlemek
else if 5 ile 10 arasında olup olmadığına göre yol belirlemek
else if 10 la 15 arasında olup olmadığına göre yol belirlemek
else if 15 ile 20 arasında olup olmadığına göre yol belirlemek


## 7. Test Sonuçları

| Doğru | Yanlış | Beklenen | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 19 | 1 | Net 18.75, Çok iyi |çok iyi |evet |
| 14 | 5 | Net 12, İyi |iyi |hayır |
| 10 | 8 | Net 8, Orta |orta |evet |
| 5 | 0 | Net 5, Geliştirilmeli | geliştirilmeli| evet|
| 4 | 16 | Net -5, Geliştirilmeli |geliştirilmeli | hayır|
| 3 | 2 | Net 7,5, Orta | geliştirilmeli| hayır|
| 15 | 13939 | Geçersiz giriş |GEÇERSİZ GİRİŞ |evet |
| 12 | 3| Geçersiz giriş |iyi | hayır|
| -14 | 5 | Geçersiz giriş |geçersiz |evet |
