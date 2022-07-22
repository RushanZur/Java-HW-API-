public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Марк";
        post.passport = "2020303030";
        post.patronymic = "Маркович";
        post.phone = "+7 (917)-917-91-91";
        post.subscription = "true";
        post.surname = "Маркович";
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 5;
        post.birthday.year = 1996;
    }
}
