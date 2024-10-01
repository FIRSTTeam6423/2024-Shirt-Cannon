package org.wmironpatriots.robot.subsystems.Drive;

import static org.wmironpatriots.robot.Constants.DRIVE_CONSTANTS.*;

import java.util.ArrayList;
import java.util.List;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Drive {

    private final List<CANSparkMax> leftMotors = new ArrayList<>();
    private final List<CANSparkMax> rightMotors = new ArrayList<>();

    private final RelativeEncoder leftEncoder;
    private final RelativeEncoder rightEncoder;

    public Drive() {
        for(int i = DRIVE_LEFT_MOTOR_IDS.length; i > 0; i--) {
            leftMotors.add(
                new CANSparkMax(DRIVE_LEFT_MOTOR_IDS[i], MotorType.kBrushless)
            );
        }
        for(int i = DRIVE_RIGHT_MOTOR_IDS.length; i > 0; i--) {
            rightMotors.add(
                new CANSparkMax(DRIVE_RIGHT_MOTOR_IDS[i], MotorType.kBrushless)
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
    
    public void setMotorVoltage(double leftSpeed, double rightSpeed) {
        for(int i = leftMotors.size(); i > 0; i--) {
            leftMotors.get(i).setVoltage(leftSpeed);
        }
        for(int i = rightMotors.size(); i > 0; i--) {
            rightMotors.get(i).setVoltage(rightSpeed);
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
