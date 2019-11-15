package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Servo;

public class Intake {
    
    public static final double INTAKE_SPEED = 1.0;

    VictorSPX intakeMotor;

    public void Intake () {
        intakeMotor = new VictorSPX(RobotMap.INTAKE_MOTOR);
    }

    public void setIntake () {
        intakeMotor.set(ControlMode.PercentOutput, INTAKE_SPEED);
    }

    public void setOuttake () {
        intakeMotor.set(ControlMode.PercentOutput, -INTAKE_SPEED);
    }
    
    public void stopIntake() {
        intakeMotor.set(ControlMode.PercentOutput, 0);
    }
    
    
    
}