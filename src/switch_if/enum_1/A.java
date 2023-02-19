package switch_if.enum_1;

public enum A {
   /* Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
    koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
    YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
    tarayıcılar için 'Geçersiz tarayıcı' yazınız.
            Not: Geliştirici konsolunda enum oluşturmalısınız. */
    CHROME("CHROME kullaniyorum"),
    SAFARI("SAFARI kullaniyorum"),
    IE("IE kullaniyorum"),
    FIREFOX("FIREFOX kullaniyorum"),
    YANDEX("YANDEX kullaniyorum"),
    GECERSIZ("GECERSIZ kullaniyorum");



    private final String neKullaniyorum;



    public String getNeKullaniyorum() {
        return neKullaniyorum;
    }

    A( String neKullaniyorum) {
        this.neKullaniyorum = neKullaniyorum;
    }
}
