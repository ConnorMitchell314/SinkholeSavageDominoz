package frc.robot;

import edu.wpi.first.wpilibj.Servo;

public class Gate {
    private static final double OPEN_POSITION = 180;
    private static final double CLOSED_POSITION  = 0;

    private Servo gateActuator = new Servo(RobotMap.GATE_SERVO);

    public void setGateOpen () {
        gateActuator.set(OPEN_POSITION/180);
    }

    public void setGateClosed () {
        gateActuator.set(CLOSED_POSITION/180);
    }
    
}