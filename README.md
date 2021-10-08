Maven Komutları:

Allure report için :
allure-cucumber4-jvm
iucumber-testng
spectjweaver
ucumber-junit
cucumber-java
Java-client
cucumber-junit
json
lf4j-api



App Path:
   "login": "//*[@text='GİRİŞ YAP']",
    "username": "//*[@id='username_edit']",
    "password": "/*[@id='password_edit']",
    "promotion button": "//*[@text='Promosyonlarım']",
    "promotion code" :"//*[@id='code']",
    "security code": "/*[@id='securityCode']",
    "member number": "//*[@text='15642754']",
     "Log out": "//*[@text='Çıkış Yap']",
    "close button": "//*[@text='Kapat']",
    "personal informations": "//*[@text='Kişisel Bilgilerim']",
    "Captca": "//*[@text='pVgAAAABJRU5ErkJggg==']",
    "continue popup": "//*[@text='DEVAM']"


Proje Yapısı: Projede Elmentler bir java class içinde tanımlanmış ve elementler gerekli yerlerde bu sınıf  içinden çağırılmaktadır. İstenildiği gibi username ve password pom.xml içinde properties olarak
tanımlanmış ve buradan çekilmektedir.
