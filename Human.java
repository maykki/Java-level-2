public class Human implements Competitor {

        private String name;

        private int maxRunDistance;
        private int maxJumpHeigth;
        private int maxSwimDistance;

        private boolean active;

        public Human(String name) {

            this.name = name;
            this.maxRunDistance = 3000;
            this.maxJumpHeigth = 15;
            this.maxSwimDistance = 5;
            this.active = true;
        }

        @Override
        public String run(int dist) {
            if (dist <= maxRunDistance) {
                return (name + " Смог");
            } else {
                active = false;
                return (name + " Не мог");

            }
        }

        @Override
        public String swim(int dist) {
            if (dist <= maxSwimDistance) {
                return (name + " проплыл");
            } else {
                active = false;
                return (name + " не проплыл");

            }
        }

        @Override
        public String jump(int height) {
            if (height <= maxJumpHeigth) {
                return (name + " перепрыгнул ");
            } else {
                active = false;
                return (name + "не перепрыгнул ");
            }
        }

        @Override
        public boolean isOnDistance() {
            return active;
        }

        @Override
        public void info() {
            System.out.println(name + " " + active);
        }
    }

