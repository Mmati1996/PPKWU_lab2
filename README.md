aplikacja składa się z trzech klas:
PpkwLab2Application - główna klasa która wywołuje wszystkie pozostałe klasy, należy ją uruchomić by wystawić api
StringAnalizer - odpiwiada za logikę i obliczenia
StringAnalizerController - wystawia api, jest wywoływana przez klasę główną - PpkwLab2Application

po uruchomieniu klasy PpkwLab2Application nasze api zostanie wystawione, by z niego skorzystać należy wysłąć zapytanie (request) get
najprościej zrobić to wchodząc w przeglądarce na strone "http://localhost:8080/stringinfo?text=1TEXT"
gdzie w miejsce "TEXT" można wstawić dowolny string który miałby zostać przeanalizowany (np. http://localhost:8080/stringinfo?string=12345_QWer), lub używając przeznaczonej do tego aplikacji jak np. postman
w odpowiedzi dostaniemy informację o tym jaki string przekazaliśmy, oraz o ilości zawartych w nim duży chliter, małych liter cyfr oraz znaków specjalnych w formacie json
