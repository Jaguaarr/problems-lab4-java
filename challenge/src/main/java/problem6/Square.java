package problem6;

public class Square implements Forme {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double getSurface() {
            return side * side;
        }

        @Override
        public String toString() {
            return String.format("Square (side %.1f cm)", side);
        }
    }


