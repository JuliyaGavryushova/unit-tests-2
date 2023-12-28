package seminars.second.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Toyota", "Camry", 2019);
    Motorcycle motorcycle = new Motorcycle("Ducati", "Panigale", 2019);

    /** Проверить, что экземпляр объекта Car также является экземпляром транспортного средства
     *  (используя оператор instanceof).
     */

    @Test
    void carIsVehicle() {
        assertThat(car instanceof Vehicle);
    }

    /** Проверить, что объект Car создается с 4-мя колесами.
     */

    @Test
    void numWheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /** Проверить, что объект Motorcycle создается с 2-мя колесами.
     */

    @Test
    void numWheelsMotorcycle() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /** Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     *  (используя метод testDrive()).
     */

    @Test
    void speedTestDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    /** Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
     *  (используя метод testDrive()).
     */

    @Test
    void speedTestDriveMotorcycle() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /** Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     *  машина останавливается (speed = 0).
     */

    @Test
    void speedParkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    /** Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
     *  мотоцикл останавливается (speed = 0).
     */

    @Test
    void speedParkMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}