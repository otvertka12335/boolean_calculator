import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Controller {
    private final static Logger logger;

    static {
        logger = Logger.getLogger(Controller.class);
    }

    @FXML
    private ComboBox<String> firstOperand;

    @FXML
    private ComboBox<String> secondOperand;

    @FXML
    private Label resultField;

    @FXML
    private Button andOperation;

    @FXML
    private Button orOperation;

    @FXML
    private Button notFirstOperator;

    @FXML
    private Button notSecondOperator;

    @FXML
    private Button contradictionOperator;

    @FXML
    private Button norOperation;

    @FXML
    private Button converseNonimplicationOperation;

    @FXML
    private Button materialNoimplicationOperation;

    @FXML
    private Button xorOperation;

    @FXML
    private Button notAndOpration;

    @FXML
    private Button xnorOperation;

    @FXML
    private Button materionalConditionalOperation;

    @FXML
    private Button converseImplicationOperation;

    @FXML
    private Button tautologyOperation;

    @FXML
    private Button eqOperation;

    @FXML
    void initialize() {
        logger.info("Ініціалізація компонент на формі");
        ObservableList<String> list = new ObservableListWrapper<>(Arrays.asList("TRUE", "FALSE", "NULL"));

        logger.info("Встановлення можливих значень для першого операнда");
        firstOperand.setItems(list);
        logger.info("Встановлення можливих значень для другого операнда");
        secondOperand.setItems(list);

        logger.info("Ініцалізація початкових значень для першого операнда");
        firstOperand.setValue("TRUE");
        logger.info("Ініцалізація початкових значень для другого операнда");
        secondOperand.setValue("TRUE");

        resultField.setAlignment(Pos.CENTER);

        logger.info("Встановлення дії на натискання andOperation");
        andOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку andOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання andOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання andOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії and");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії and");
            String res = first.toString().toUpperCase() + " "
                    + andOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.andOperation() + "").toUpperCase();
            logger.info("Результат виконання дії and: " + res);

            logger.info("Виведення на формі результатів виконання дії and");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання orOperation");
        orOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку orOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання orOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання orOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії or");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії or");
            String res = first.toString().toUpperCase() + " "
                    + orOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.orOperation() + "").toUpperCase();
            logger.info("Результат виконання дії and: " + res);

            logger.info("Виведення на формі результатів виконання дії orOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання notFirstOperator");
        notFirstOperator.setOnAction(event -> {
            logger.info("Натиснуто кнопку notFirstOperator");

            logger.info("Ініціалізація новим значенням першого операнда для виконання notFirstOperator");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання notFirstOperator");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії notFirstOperator");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії notFirstOperator");
            String res = first.toString().toUpperCase() + " "
                    + notFirstOperator.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.notFirstOperator() + "").toUpperCase();
            logger.info("Результат виконання дії and: " + res);

            logger.info("Виведення на формі результатів виконання дії notFirstOperator");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання notSecondOperator");
        notSecondOperator.setOnAction(event -> {
            logger.info("Натиснуто кнопку notFirstOperator");

            logger.info("Ініціалізація новим значенням першого операнда для виконання notSecondOperator");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання notSecondOperator");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії notSecondOperator");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії notSecondOperator");
            String res = first.toString().toUpperCase() + " "
                    + notSecondOperator.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.notSecondOperator() + "").toUpperCase();
            logger.info("Результат виконання дії and: " + res);

            logger.info("Виведення на формі результатів виконання дії notSecondOperator");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання contradictionOperator");
        contradictionOperator.setOnAction(event -> {
            logger.info("Натиснуто кнопку contradictionOperator");

            logger.info("Ініціалізація новим значенням першого операнда для виконання contradictionOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання contradictionOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії contradictionOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії contradictionOperation");
            String res = first.toString().toUpperCase() + " "
                    + contradictionOperator.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.contradictionOperation() + "").toUpperCase();
            logger.info("Результат виконання дії contradictionOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії contradictionOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання norOperation");
        norOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку contradictionOperator");

            logger.info("Ініціалізація новим значенням першого операнда для виконання norOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання norOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії norOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії norOperation");
            String res = first.toString().toUpperCase() + " "
                    + norOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.norOperation() + "").toUpperCase();
            logger.info("Результат виконання дії norOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії norOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання converseNonimplicationOperation");
        converseNonimplicationOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку converseNonimplicationOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання converseNonimplicationOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання converseNonimplicationOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії converseNonimplicationOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії converseNonimplicationOperation");
            String res = first.toString().toUpperCase() + " "
                    + converseNonimplicationOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.converseNonimplicationOperation() + "").toUpperCase();
            logger.info("Результат виконання дії converseNonimplicationOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії converseNonimplicationOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання materialNoimplicationOperation");
        materialNoimplicationOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку materialNoimplicationOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання materialNoimplicationOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання materialNoimplicationOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії materialNoimplicationOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії materialNoimplicationOperation");
            String res = first.toString().toUpperCase() + " "
                    + materialNoimplicationOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.materialNoimplicationOperation() + "").toUpperCase();
            logger.info("Результат виконання дії materialNoimplicationOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії materialNoimplicationOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання xorOperation");
        xorOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку xorOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання xorOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання xorOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії xorOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії xorOperation");
            String res = first.toString().toUpperCase() + " "
                    + xorOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.xorOperation() + "").toUpperCase();
            logger.info("Результат виконання дії xorOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії xorOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання notAndOpration");
        notAndOpration.setOnAction(event -> {
            logger.info("Натиснуто кнопку notAndOpration");

            logger.info("Ініціалізація новим значенням першого операнда для виконання notAndOpration");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання notAndOpration");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії notAndOpration");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії notAndOpration");
            String res = first.toString().toUpperCase() + " "
                    + notAndOpration.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.nandOperation() + "").toUpperCase();
            logger.info("Результат виконання дії notAndOpration: " + res);

            logger.info("Виведення на формі результатів виконання дії notAndOpration");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання xnorOperation");
        xnorOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку xnorOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання xnorOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання xnorOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії xnorOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії xnorOperation");
            String res = first.toString().toUpperCase() + " "
                    + xnorOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.xnorOperation() + "").toUpperCase();
            logger.info("Результат виконання дії xnorOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії xnorOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання materionalConditionalOperation");
        materionalConditionalOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку materionalConditionalOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання materionalConditionalOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання materionalConditionalOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії materionalConditionalOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії materionalConditionalOperation");
            String res = first.toString().toUpperCase() + " "
                    + materionalConditionalOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.materionalConditionalOperation() + "").toUpperCase();
            logger.info("Результат виконання дії materionalConditionalOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії materionalConditionalOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання converseImplicationOperation");
        converseImplicationOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку converseImplicationOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання converseImplicationOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання converseImplicationOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії converseImplicationOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії converseImplicationOperation");
            String res = first.toString().toUpperCase() + " "
                    + converseImplicationOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.converseImplicationOperation() + "").toUpperCase();
            logger.info("Результат виконання дії converseImplicationOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії converseImplicationOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання tautologyOperation");
        tautologyOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку tautologyOperation");

            logger.info("Ініціалізація новим значенням першого операнда для виконання tautologyOperation");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання tautologyOperation");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії tautologyOperation");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії tautologyOperation");
            String res = first.toString().toUpperCase() + " "
                    + tautologyOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.tautologyOperation() + "").toUpperCase();
            logger.info("Результат виконання дії tautologyOperation: " + res);

            logger.info("Виведення на формі результатів виконання дії tautologyOperation");
            resultField.setText(res);
        });

        logger.info("Встановлення дії на натискання equinity");
        eqOperation.setOnAction(event -> {
            logger.info("Натиснуто кнопку equinity");

            logger.info("Ініціалізація новим значенням першого операнда для виконання equinity");
            Operand first = new Operand(firstOperand.getValue());
            logger.info("Ініціалізація новим значенням другого операнда для виконання equinity");
            Operand second = new Operand(secondOperand.getValue());

            logger.info("Створення OperatorService для виконання дії equinity");
            OperatorService service = new OperatorService(first, second);

            logger.info("Формування рядка результату виконання дії equinity");
            String res = first.toString().toUpperCase() + " "
                    + eqOperation.getText() + " " + second.toString().toUpperCase()
                    + " = " + (service.equinity() + "").toUpperCase();
            logger.info("Результат виконання дії equinity: " + res);

            logger.info("Виведення на формі результатів виконання дії equinity");
            resultField.setText(res);
        });
    }


}
