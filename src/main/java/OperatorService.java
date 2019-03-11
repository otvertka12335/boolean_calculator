import org.apache.log4j.Logger;

class OperatorService {
    private final static Logger logger = Logger.getLogger(OperatorService.class);

    private Operand firstOperand;
    private Operand secondOperand;

    OperatorService(Operand firstOperand, Operand secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;

        logger.info("Створено об'єкт OperatorService зі значеннями операндів " + firstOperand.value() +
                " i " + secondOperand.value());
    }

    Boolean andOperation() {
        logger.info("Виконання дії andOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції andOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() && secondOperand.value();
        logger.info("Результат виконання операції andOperation: " + result);
        return result;
    }

    Boolean orOperation() {
        logger.info("Виконання дії orOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції orOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() || secondOperand.value();
        logger.info("Результат виконання операції orOperation: " + result);
        return result;
    }

    Boolean notFirstOperator() {
        logger.info("Виконання дії notFirstOperator");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення першого операнда null, результатом операції notFirstOperator буде null");
            return null;
        }

        Boolean result = !firstOperand.value();
        logger.info("Результат виконання операції notFirstOperator: " + result);
        return result;
    }

    Boolean notSecondOperator() {
        logger.info("Виконання дії notSecondOperator");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення другого операнда null, результатом операції notSecondOperator буде null");
            return null;
        }

        Boolean result = !secondOperand.value();
        logger.info("Результат виконання операції notSecondOperator: " + result);
        return result;
    }

    Boolean contradictionOperation() {
        logger.info("Виконання дії contradictionOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції contradictionOperation буде null");
            return null;
        }

        logger.info("Результат виконання операції contradictionOperation: " + false);
        return false;
    }

    Boolean norOperation() {
        logger.info("Виконання дії norOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції norOperation буде null");
            return null;
        }

        Boolean result = !firstOperand.value() && !secondOperand.value();
        logger.info("Результат виконання операції norOperation: " + result);
        return result;
    }

    Boolean converseNonimplicationOperation() {
        logger.info("Виконання дії converseNonimplicationOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції converseNonimplicationOperation буде null");
            return null;
        }

        Boolean result = !firstOperand.value() && secondOperand.value();
        logger.info("Результат виконання операції converseNonimplicationOperation: " + result);
        return result;
    }

    Boolean materialNoimplicationOperation() {
        logger.info("Виконання дії materialNoimplicationOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції materialNoimplicationOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() && !secondOperand.value();
        logger.info("Результат виконання операції materialNoimplicationOperation: " + result);
        return result;
    }

    Boolean xorOperation() {
        logger.info("Виконання дії xorOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції xorOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() ^ secondOperand.value();
        logger.info("Результат виконання операції xorOperation: " + result);
        return result;
    }

    Boolean nandOperation() {
        logger.info("Виконання дії nandOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції nandOperation буде null");
            return null;
        }

        Boolean result = !(firstOperand.value() && secondOperand.value());
        logger.info("Результат виконання операції nandOperation: " + result);
        return result;
    }

    Boolean materionalConditionalOperation() {
        logger.info("Виконання дії materionalConditionalOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції materionalConditionalOperation буде null");
            return null;
        }

        Boolean result = !firstOperand.value() || secondOperand.value();
        logger.info("Результат виконання операції materionalConditionalOperation: " + result);
        return result;
    }

    Boolean converseImplicationOperation() {
        logger.info("Виконання дії converseImplicationOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції converseImplicationOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() || !secondOperand.value();
        logger.info("Результат виконання операції converseImplicationOperation: " + result);
        return result;
    }

    Boolean xnorOperation() {
        logger.info("Виконання дії xnorOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції xnorOperation буде null");
            return null;
        }

        Boolean result = firstOperand.value() == secondOperand.value();
        logger.info("Результат виконання операції xnorOperation: " + result);
        return result;
    }

    Boolean tautologyOperation() {
        logger.info("Виконання дії tautologyOperation");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції tautologyOperation буде null");
            return null;
        }

        logger.info("Результат виконання операції tautologyOperation: " + true);
        return true;
    }

    Boolean equinity() {
        logger.info("Виконання дії equinity");

        if (firstOperand.value() == null || secondOperand.value() == null) {
            logger.warn("Значення одного з операндів null, результатом операції equinity буде null");
            return null;
        }

        Boolean result = firstOperand.value() == secondOperand.value();
        logger.info("Результат виконання операції equinity: " + result);
        return result;
    }

    Boolean projectionToFirstOperand() {
        logger.info("Виконання дії equinity");

        if (firstOperand.value() == null) {
            logger.warn("Значення першого операнда null, результатом операції projectionToFirstOperand буде null");
            return null;
        }

        logger.info("Результат виконання операції projectionToFirstOperand: " + firstOperand.value());
        return firstOperand.value();
    }

    Boolean projectionToSecondOperand() {
        logger.info("Виконання дії projectionToSecondOperand");

        if (firstOperand.value() == null) {
            logger.warn("Значення першого операнда null, результатом операції projectionToSecondOperand буде null");
            return null;
        }

        logger.info("Результат виконання операції projectionToSecondOperand: " + secondOperand.value());
        return secondOperand.value();
    }

    Boolean andOperationWithSingleOperation() {
        if (firstOperand.value() != null && !firstOperand.value()) {
            return false;
        } else {
            return andOperation();
        }
    }

    Boolean orOperationWithSingle() {
        if (firstOperand.value() != null && firstOperand.value()) {
            return true;
        } else if (secondOperand.value() != null && secondOperand.value()) {
            return true;
        } else {
            return orOperation();
        }
    }

    Boolean norSingleOperation() {
        if (firstOperand.value() != null && secondOperand.value() == null) {
            return false;
        } else {
            return norOperation();
        }
    }
}
