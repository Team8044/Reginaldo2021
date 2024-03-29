/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {
  private final Shooter shooter;
  private final double speed;
  /**
   * Creates a new Shoot.
   */
  public Shoot(Shooter shooter) {
    this.shooter = shooter;
    speed = Constants.SHOOTER_MOTOR_SPEED;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(shooter);
  }

  public Shoot(Shooter shooter, double speed) {
    this.shooter = shooter;
    this.speed = speed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // sets the speed of the shooter motors 
    shooter.setShooterMotors(Constants.SHOOTER_MOTOR_SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    shooter.setShooterMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
