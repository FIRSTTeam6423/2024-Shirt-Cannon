package org.wmironpatriots.robot.subsystems.drive;

import static org.wmironpatriots.robot.Constants.DriveConstantsK.*;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;

    private final RelativeEncoder leftEncoder;
    private final RelativeEncoder rightEncoder;

    public Drive() {
        leftMotor = new CANSparkMax(kdriveLeftMotorID, MotorType.kBrushless);
        rightMotor = new CANSparkMax(kdriveRightMotorID, MotorType.kBrushless);

        leftEncoder = leftMotor.getEncoder();
        rightEncoder = rightMotor.getEncoder();
    }

    /**
     * Stops Motors
     * 
     */
    public void stopMotors() {

        leftMotor.stopMotor();
        rightMotor.stopMotor();

    }

}
