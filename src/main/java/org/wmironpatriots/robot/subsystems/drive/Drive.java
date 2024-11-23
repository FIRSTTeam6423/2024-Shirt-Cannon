package org.wmironpatriots.robot.subsystems.drive;

import static org.wmironpatriots.robot.Constants.DriveConstantsK.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;

    public Drive() {

        leftMotor = new CANSparkMax(kdriveLeftMotorID, MotorType.kBrushless);
        rightMotor = new CANSparkMax(kdriveRightMotorID, MotorType.kBrushless);

    }

    public void setMotorSpeed(double leftSpeed, double rightSpeed) {

        leftMotor.set(leftSpeed);
        rightMotor.set(rightSpeed);

    }

    public void stopMotors() {

        leftMotor.stopMotor();
        rightMotor.stopMotor();

    }
    
}
