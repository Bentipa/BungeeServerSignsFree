package me.Bentipa.BungeeSignsFree.pinghelp;

public class StatusResponse_116 {

    private Description description;
    private Players players;
    private Version version;

    class Version {
        String name;
        String protocol;
    }

    class Players {
        int max, online;
    }

    class Description {
        String text;
        DescriptionExtra[] extra;
    }

    class DescriptionExtra{
        String text;
    }

    public Description getDescription() {
        return description;
    }

    public Players getPlayers() {
        return players;
    }

    public Version getVersion() {
        return version;
    }
}
