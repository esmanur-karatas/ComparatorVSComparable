# ComparatorVSComparable
Bu proje, Java'da Comparator ve Comparable arabirimlerini kullanarak nesneleri karşılaştırma ve sıralama konseptini göstermektedir.

## Phone Sınıfı
Phone sınıfı, bir telefon nesnesini temsil eder. Bu sınıf, Comparable<Phone> arabirimini uygular, böylece telefon nesneleri doğal bir şekilde sıralanabilir. compareTo metodu, telefonların çıkış yılına göre sıralama kriterini belirler.

## Telefon nesnelerinin özellikleri:

- Marka
- Model
- RAM miktarı
- Hafıza miktarı
- Çıkış yılı
- Main Metodu: ComparatorVsComparable
- main metodu, telefon nesneleri oluşturur ve bunları farklı sıralama yöntemlerine göre sıralar.

- Telefon nesneleri oluşturulur.
- Telefon nesneleri doğal sıraya göre sıralanır ve listelenir.
- Telefon nesneleri doğal sıraya göre büyükten küçüğe sıralanır ve listelenir.
- Telefon nesneleri Comparator ile hafıza miktarına göre sıralanır ve listelenir.
- Telefon nesneleri hafıza miktarına göre büyükten küçüğe sıralanır ve listelenir.
- Telefon nesneleri Lambda ifadesi ile RAM miktarına göre küçükten büyüğe sıralanır ve listelenir.
- Telefon nesneleri Lambda ifadesi ile RAM miktarına göre büyükten küçüğe sıralanır ve listelenir.

## Çalıştırma
Projeyi çalıştırmak için ComparatorVsComparable sınıfını çalıştırın. Sıralama sonuçları konsola yazdırılacaktır.

## Dikkat Edilmesi Gereken Noktalar
- Comparable arabirimini uygulayan sınıflar, doğal sıralamayı belirlemek için compareTo metodunu uygulamalıdır.
- Comparator arabirimini uygulayan sınıflar, farklı sıralama kriterlerini belirlemek için compare metodu üzerinden özel bir karşılaştırma mantığı sağlar.

  ![image](https://github.com/esmanur-karatas/ComparatorVSComparable/assets/83882274/e102109f-ca8d-47a7-b2f7-1a7277c06968)
