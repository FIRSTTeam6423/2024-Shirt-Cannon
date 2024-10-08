package org.wmironpatriots.robot.subsystems.drive;

import static org.wmironpatriots.robot.Constants.DriveConstantsK.*;

import java.util.ArrayList;
import java.util.List;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private final List<CANSparkMax> leftMotors = new ArrayList<>();
    private final List<CANSparkMax> rightMotors = new ArrayList<>();

    private final RelativeEncoder leftEncoder;
    private final RelativeEncoder rightEncoder;

    public Drive() {
        for(int i = kdriveLeftMotorIDs.length; i > 0; i--) {
            leftMotors.add(
                new CANSparkMax(kdriveLeftMotorIDs[i], MotorType.kBrushless)
            );
        }
        for(int i = kdriveRightMotorIDs.length; i > 0; i--) {
            rightMotors.add(
                new CANSparkMax(kdriveRightMotorIDs[i], MotorType.kBrushless)
            );
        }

        leftEncoder = leftMotors.get(0).getEncoder();
        rightEncoder = rightMotors.get(0).getEncoder();
    }

    // * SETTER

    public void setMotorVoltageInput(double leftVoltage, double rightVoltage) {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).setVoltage(leftVoltage);
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).setVoltage(rightVoltage);
        }
    }
    
    public void setMotorSpeed(double leftSpeed, double rightSpeed) {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).set(leftSpeed);
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).set(rightSpeed);
        }
    }

    public void stopMotors() {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).stopMotor();
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).stopMotor();
        }
    }

}
