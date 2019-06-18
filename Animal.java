public class Animal implements Competitor {

    private String type;
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;

    private boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeigth, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (type + " " + name + " пробежал");
        } else {
            onDistance = false;
            return (type + " " + name + " не пробежал");

        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (type + " " + name + " проплыл");
        } else {
            onDistance = false;
            return (type + " " + name + " не проплыл");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return (type + " " + name + " перепрыгнул");
        } else {
            onDistance = false;
            return (type + " " + name + " не перепрыгнул");
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
