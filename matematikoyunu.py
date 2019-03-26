# 1->TOPLAMA  2->ÇIKARTMA  3->ÇARPMA  4->FAKTÖRİYEL

import random
import time
import math
skor = 0
while True:
    a=random.randint(1,4)

    print("lütfen bekleyin yeni soru hazırlanıyor...")
    time.sleep(2)

    if a == 1:
        print("toplama işlemi")
        ilksayi = random.randint(1,20)
        ikincisayi = random.randint(1,20)
        print("lütfen",ilksayi,"ile",ikincisayi,"sayılarının toplamını giriniz  ")
        sonuc = int(input("cevap :"))

        if (sonuc==ilksayi+ikincisayi) :
            print("tebrikler doğru bildiniz")
            skor = skor+1
            print("mevcut skorunuz :", skor)
            time.sleep(2)
        else:
            print("YANLIŞ! doğru cevap :",ilksayi+ikincisayi)
            skor = skor -3
            print("mevcut skorunuz :", skor)
            time.sleep(2)

    if a == 2:
        print("çıkarma işlemi ")
        ilksayi = random.randint(1,20)
        ikincisayi = random.randint(1,20)
        print("lütfen",ilksayi,"ile",ikincisayi,"sayılarının farkını giriniz  ")
        sonuc = int(input("cevap :"))

        if (sonuc == ilksayi - ikincisayi) :
            print("tebrikler doğru bildiniz")
            skor = skor + 1
            print("mevcut skorunuz :", skor)
            time.sleep(2)
        else:
            print("YANLIŞ!","doğru cevap :",ilksayi - ikincisayi)
            skor = skor - 3
            print("mevcut skorunuz :", skor)
            time.sleep(2)

    if a == 3:
        print("çarpma işlemi ")
        ilksayi = random.randint(1,10)
        ikincisayi = random.randint(1,10)
        print("lütfen",ilksayi,"ile",ikincisayi,"sayılarının çarpımını giriniz  ")
        sonuc = int(input("cevap :"))

        if (sonuc == ilksayi * ikincisayi) :
            print("tebrikler doğru bildiniz")
            skor = skor + 1
            print("mevcut skorunuz :", skor)
            time.sleep(2)
        else:
            print("YANLIŞ!","doğru cevap :",ilksayi * ikincisayi)
            skor = skor - 3
            print("mevcut skorunuz :", skor)
            time.sleep(2)

    if a == 4:
        print("faktöriyel işlemi ")
        ilksayi = random.randint(1,5)
        print("lütfen",ilksayi,"sayısının faktöriyelini giriniz  ")
        sonuc = int(input("cevap :"))

        if (sonuc == math.factorial(ilksayi)) :
            print("tebrikler doğru bildiniz")
            skor = skor + 1
            print("mevcut skorunuz :", skor)
            time.sleep(2)
        else:
            print("YANLIŞ!","doğru cevap :",math.factorial(ilksayi))
            skor = skor - 3
            print("mevcut skorunuz :",skor)
        time.sleep(2)