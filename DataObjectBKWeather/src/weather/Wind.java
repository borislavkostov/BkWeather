
package weather;

public class Wind {
    private Speed speed;
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
    
}
