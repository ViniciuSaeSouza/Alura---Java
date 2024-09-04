package Desafios.Desafios07.ExGitHubAPI;

public class MyGitHubUserClass {

    private String login;

    private String location;

    private int followers;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }


    public MyGitHubUserClass(GitHubUserRecord rec){
        this.login = rec.login();
        this.location = rec.location();
        this.followers = Integer.parseInt(rec.followers());
    }

    @Override
    public String toString() {
        return "Usuário: " + this.getLogin() + " | Local: " + this.getLocation() + " | " + "Seguidores: " + this.getFollowers();
    }
}
