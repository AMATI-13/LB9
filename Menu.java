package LB7;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Calculator calculator;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.calculator = new Calculator();
    }

    public void start() {
        boolean running = true;

        while (running) {
            showMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addShape();
                    break;
                case "2":
                    showProgramInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "4":
                    calculator.showAllShapes();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
        scanner.close();
    }

    private void showMenu() {
        System.out.println("\nГлавное меню:");
        System.out.println("1 - Добавить фигуру");
        System.out.println("2 - Информация о программе");
        System.out.println("3 - Информация о разработчике");
        System.out.println("4 - Показать все фигуры");
        System.out.println("5 - Выход из программы");
        System.out.print("Ваш выбор: ");
    }

    private void addShape() {
        System.out.print("Выберите фигуру (1 - Круг, 2 - Квадрат): ");
        int shapeType = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        try {
            switch (shapeType) {
                case 1:
                    System.out.print("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера
                    Circle circle = new Circle(radius);
                    calculator.addShape(circle);
                    System.out.println("Фигура добавлена: " + circle);
                    break;
                case 2:
                    System.out.print("Введите длину стороны квадрата: ");
                    double side = scanner.nextDouble();
                    scanner.nextLine(); // Очистка буфера
                    Square square = new Square(side);
                    calculator.addShape(square);
                    System.out.println("Фигура добавлена: " + square);
                    break;
                default:
                    System.out.println("Неверный тип фигуры.");
            }
        } catch (InvalidShapeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
            scanner.nextLine(); // Очистка буфера
        }
    }

    private void showProgramInfo() {
        System.out.println("Эта программа вычисляет площади и периметры различных фигур.");
    }

    private void showDeveloperInfo() {
        System.out.println("Разработчик: Ваше имя");
    }
}
