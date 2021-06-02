// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AimAndShootBlueZone extends SequentialCommandGroup {
  /** Creates a new AimAndShootBlueZone. */
  public AimAndShootBlueZone(DriveTrain dt, Shooter shooter, Intake intake) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new VisionTurnPID(dt), 
      new VisionAimPID(shooter, Constants.SHOOTER_BLUEZONE_AIM_ANG_FF), 
      new ShootAndIndex(intake, shooter, Constants.SHOOTER_BLUEZONE_VEL)
    );
  }
}
