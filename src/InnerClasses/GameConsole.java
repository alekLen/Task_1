package InnerClasses;

public class GameConsole {
    private final Brand brand;
    private String model;
    private final String serial;
    public class Gamepad{
        private final Brand brand;
        private final String consoleSerial;
        private final int connectedNumber;
        private  Color color;
        private double chargeLevel = 100.0;
        private boolean isOn;

        public Gamepad(Brand brand, int connectedNumber) {
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public Brand getBrand() {
            return brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public Color getColor() {
            return color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }
    }
    private final Gamepad secondGamepad;
    private final Gamepad firstGamepad;
    private boolean isOn;
    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        firstGamepad = new Gamepad(brand,1);
        secondGamepad = new Gamepad(brand,2);
    }
    public static class Game{
        private final String name;
        private final Genre genre;
        private final Type type;
        public enum Type {
            VIRTUAL,
            PHYSICAL
        }
        private Game(String name, Genre genre, Type type) {
            this.name = name;
            this.genre = genre;
            this.type = type;
        }
public static class GameDisk{
      private final String description;
      private final Game data;

    private GameDisk(String name,Genre genre,String description) {
        this.description = description;
        data=new Game(name,genre,Type.PHYSICAL);
    }

    public String getDescription() {
        return description;
    }

    public Game getData() {
        return data;
    }
}
        public static class VirtualGame{
            private int rating;
            private final Game data;

            private VirtualGame(String name,Genre genre) {
                data=new Game(name,genre,Type.VIRTUAL);
            }

            public void setRating(int rating) {
                if (rating >= 0 && rating <= 5) {
                    this.rating = rating;
                } else {
                    System.out.println("Рейтинг должен быть от 0 до 5");
                }
            }

            public int getRating() {
                return rating;
            }

            public Game getData() {
                return data;
            }
        }
        public static GameDisk getDisk( String name,Genre genre,String description){
            return new GameDisk(name,genre,description);
        }
        public static VirtualGame getVirtualGame( String name,Genre genre){
            return new VirtualGame(name,genre);
        }
        public String getName() {
            return name;
        }

        public Genre getGenre() {
            return genre;
        }

        public Type getType() {
            return type;
        }
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public boolean isOn() {
        return isOn;
    }
}
