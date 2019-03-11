import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OperandServiceTest {
    private OperatorService testObject1 = new OperatorService(
            new Operand("TRUE"), new Operand("TRUE"));
    private OperatorService testObject2 = new OperatorService(
            new Operand("TRUE"), new Operand("False"));
    private OperatorService testObject3 = new OperatorService(
            new Operand("False"), new Operand("TRUE"));
    private OperatorService testObject4 = new OperatorService(
            new Operand("False"), new Operand("False"));
    private OperatorService testObject5 = new OperatorService(
            new Operand("TRUE"), new Operand("NULL"));
    private OperatorService testObject6 = new OperatorService(
            new Operand("False"), new Operand("NULL"));
    private OperatorService testObject7 = new OperatorService(
            new Operand("NULL"), new Operand("TRUE"));
    private OperatorService testObject8 = new OperatorService(
            new Operand("NULL"), new Operand("False"));
    private OperatorService testObject9 = new OperatorService(
            new Operand("NULL"), new Operand("NULL"));

    //-------------------------------AND----------------------------------
    @Test
    void andOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.andOperation());
    }

    @Test
    void andOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.andOperation());
    }

    @Test
    void andOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.andOperation());
    }

    @Test
    void andOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.andOperation());
    }

    @Test
    void andOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.andOperation());
    }

    @Test
    void andOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.andOperation());
    }

    @Test
    void andOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.andOperation());
    }

    @Test
    void andOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.andOperation());
    }

    @Test
    void andOperationWithNullAndNull() {
        Assert.assertNull(testObject9.andOperation());
    }

    //----------------------------------OR-----------------------------------------------
    @Test
    void orOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.orOperation());
    }

    @Test
    void orOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.orOperation());
    }

    @Test
    void orOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.orOperation());
    }

    @Test
    void orOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.orOperation());
    }

    @Test
    void orOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.orOperation());
    }

    @Test
    void orOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.orOperation());
    }

    @Test
    void orOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.orOperation());
    }

    @Test
    void orOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.orOperation());
    }

    @Test
    void orOperationWithNullAndNull() {
        Assert.assertNull(testObject9.orOperation());
    }

    //---------------------------------Not first operand--------------------------------
    @Test
    void notFirstOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.notFirstOperator());
    }

    @Test
    void notFirstOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.notFirstOperator());
    }

    @Test
    void notFirstOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.notFirstOperator());
    }

    @Test
    void notFirstOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.notFirstOperator());
    }

    @Test
    void notFirstOperationWithTrueAndNull() {
        Assert.assertEquals(false, testObject5.notFirstOperator());
    }

    @Test
    void notFirstOperationWithFalseAndNull() {
        Assert.assertEquals(true, testObject6.notFirstOperator());
    }

    @Test
    void notFirstOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.notFirstOperator());
    }

    @Test
    void notFirstOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.notFirstOperator());
    }

    @Test
    void notFirstOperationWithNullAndNull() {
        Assert.assertNull(testObject9.notFirstOperator());
    }

    //---------------------------------Not second operand--------------------------------
    @Test
    void notSecondOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.notSecondOperator());
    }

    @Test
    void notSecondOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.notSecondOperator());
    }

    @Test
    void notSecondOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.notSecondOperator());
    }

    @Test
    void notSecondOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.notSecondOperator());
    }

    @Test
    void notSecondOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.notSecondOperator());
    }

    @Test
    void notSecondOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.notSecondOperator());
    }

    @Test
    void notSecondOperationWithNullAndTrue() {
        Assert.assertEquals(false, testObject7.notSecondOperator());
    }

    @Test
    void notSecondOperationWithNullAndFalse() {
        Assert.assertEquals(true, testObject8.notSecondOperator());
    }

    @Test
    void notSecondOperationWithNullAndNull() {
        Assert.assertNull(testObject9.notSecondOperator());
    }

    //---------------------------------Coordination operation-------------------------------
    @Test
    void contradictionOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.contradictionOperation());
    }

    @Test
    void contradictionOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.contradictionOperation());
    }

    @Test
    void contradictionOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.contradictionOperation());
    }

    @Test
    void contradictionOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.contradictionOperation());
    }

    @Test
    void contradictionOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.contradictionOperation());
    }

    @Test
    void contradictionOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.contradictionOperation());
    }

    @Test
    void contradictionOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.contradictionOperation());
    }

    @Test
    void contradictionOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.contradictionOperation());
    }

    @Test
    void contradictionOperationWithNullAndNull() {
        Assert.assertNull(testObject9.contradictionOperation());
    }

    //---------------------------------------NOR operation-------------------------
    @Test
    void norOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.norOperation());
    }

    @Test
    void norOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.norOperation());
    }

    @Test
    void norOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.norOperation());
    }

    @Test
    void norOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.norOperation());
    }

    @Test
    void norOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.norOperation());
    }

    @Test
    void norOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.norOperation());
    }

    @Test
    void norOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.norOperation());
    }

    @Test
    void norOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.norOperation());
    }

    @Test
    void norOperationWithNullAndNull() {
        Assert.assertNull(testObject9.norOperation());
    }

    //--------------------------------converse non implication operation---------------
    @Test
    void converseNonimplicationOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.converseNonimplicationOperation());
    }

    @Test
    void converseNonimplicationOperationWithNullAndNull() {
        Assert.assertNull(testObject9.converseNonimplicationOperation());
    }

    //-------------------------------material no implication operation---------------
    @Test
    void materialNoimplicationOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.materialNoimplicationOperation());
    }

    @Test
    void materialNoimplicationOperationWithNullAndNull() {
        Assert.assertNull(testObject9.materialNoimplicationOperation());
    }

    //--------------------------------------XOR operation----------------------------
    @Test
    void xorOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.xorOperation());
    }

    @Test
    void xorOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.xorOperation());
    }

    @Test
    void xorOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.xorOperation());
    }

    @Test
    void xorOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.xorOperation());
    }

    @Test
    void xorOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.xorOperation());
    }

    @Test
    void xorOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.xorOperation());
    }

    @Test
    void xorOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.xorOperation());
    }

    @Test
    void xorOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.xorOperation());
    }

    @Test
    void xorOperationWithNullAndNull() {
        Assert.assertNull(testObject9.xorOperation());
    }

    //--------------------------------NAND operation--------------------------
    @Test
    void nandOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.nandOperation());
    }

    @Test
    void nandOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.nandOperation());
    }

    @Test
    void nandOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.nandOperation());
    }

    @Test
    void nandOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.nandOperation());
    }

    @Test
    void nandOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.nandOperation());
    }

    @Test
    void nandOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.nandOperation());
    }

    @Test
    void nandOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.nandOperation());
    }

    @Test
    void nandOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.nandOperation());
    }

    @Test
    void nandOperationWithNullAndNull() {
        Assert.assertNull(testObject9.nandOperation());
    }

    //-----------------------------------materional conditional operation--------------------
    @Test
    void materionalConditionalOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.materionalConditionalOperation());
    }

    @Test
    void materionalConditionalOperationWithNullAndNull() {
        Assert.assertNull(testObject9.materionalConditionalOperation());
    }

    //------------------------------converse implication operation-------------------------
    @Test
    void converseImplicationOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.converseImplicationOperation());
    }

    @Test
    void converseImplicationOperationWithNullAndNull() {
        Assert.assertNull(testObject9.converseImplicationOperation());
    }

    //----------------------------------XNOR operation----------------------------
    @Test
    void xnorOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.xnorOperation());
    }

    @Test
    void xnorOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.xnorOperation());
    }

    @Test
    void xnorOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.xnorOperation());
    }

    @Test
    void xnorOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.xnorOperation());
    }

    @Test
    void xnorOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.xnorOperation());
    }

    @Test
    void xnorOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.xnorOperation());
    }

    @Test
    void xnorOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.xnorOperation());
    }

    @Test
    void xnorOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.xnorOperation());
    }

    @Test
    void xnorOperationWithNullAndNull() {
        Assert.assertNull(testObject9.xnorOperation());
    }

    //---------------------------tautology operation-------------------------------
    @Test
    void tautologyOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.tautologyOperation());
    }

    @Test
    void tautologyOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.tautologyOperation());
    }

    @Test
    void tautologyOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.tautologyOperation());
    }

    @Test
    void tautologyOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.tautologyOperation());
    }

    @Test
    void tautologyOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.tautologyOperation());
    }

    @Test
    void tautologyOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.tautologyOperation());
    }

    @Test
    void tautologyOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.tautologyOperation());
    }

    @Test
    void tautologyOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.tautologyOperation());
    }

    @Test
    void tautologyOperationWithNullAndNull() {
        Assert.assertNull(testObject9.tautologyOperation());
    }

    //----------------------------------projection to first operand operation---------------
    @Test
    void projectionToFirstOperandOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithTrueAndNull() {
        Assert.assertEquals(true, testObject5.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithFalseAndNull() {
        Assert.assertEquals(false, testObject6.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.projectionToFirstOperand());
    }

    @Test
    void projectionToFirstOperandOperationWithNullAndNull() {
        Assert.assertNull(testObject9.projectionToFirstOperand());
    }

    //----------------------------------projection to second operand operation---------------
    @Test
    void projectionToSecondOperandOperationTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithFalseAndNull() {
        Assert.assertNull(testObject6.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithNullAndTrue() {
        Assert.assertEquals(true, testObject7.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithNullAndFalse() {
        Assert.assertEquals(false, testObject8.projectionToSecondOperand());
    }

    @Test
    void projectionToSecondOperandOperationWithNullAndNull() {
        Assert.assertNull(testObject9.projectionToSecondOperand());
    }

    //----------------------------and operation single version----------------------
    @Test
    void andOperationWithSingleTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithTrueAndNull() {
        Assert.assertNull(testObject5.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithFalseAndNull() {
        Assert.assertEquals(false, testObject6.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.andOperationWithSingleOperation());
    }

    @Test
    void andOperationWithSingleOperationWithNullAndNull() {
        Assert.assertNull(testObject9.andOperationWithSingleOperation());
    }

    //-----------------------------or operation with single---------------------
    @Test
    void orOperationWithSingleTestWithTrueAndTrue() {
        Assert.assertEquals(true, testObject1.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithTrueAndFalse() {
        Assert.assertEquals(true, testObject2.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithFalseAndTrue() {
        Assert.assertEquals(true, testObject3.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithFalseAndFalse() {
        Assert.assertEquals(false, testObject4.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithTrueAndNull() {
        Assert.assertEquals(true, testObject5.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithFalseAndNull() {
        Assert.assertNull(testObject6.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithNullAndTrue() {
        Assert.assertEquals(true, testObject7.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithNullAndFalse() {
        Assert.assertNull(testObject8.orOperationWithSingle());
    }

    @Test
    void orOperationWithSingleWithNullAndNull() {
        Assert.assertNull(testObject9.orOperationWithSingle());
    }
    //------------------- nor Single operation ----------------------------------------------------------------
    @Test
    void norSingleOperationTestWithTrueAndTrue() {
        Assert.assertEquals(false, testObject1.norSingleOperation());
    }

    @Test
    void norSingleOperationWithTrueAndFalse() {
        Assert.assertEquals(false, testObject2.norSingleOperation());
    }

    @Test
    void norSingleOperationWithFalseAndTrue() {
        Assert.assertEquals(false, testObject3.norSingleOperation());
    }

    @Test
    void norSingleOperationWithFalseAndFalse() {
        Assert.assertEquals(true, testObject4.norSingleOperation());
    }

    @Test
    void norSingleOperationWithTrueAndNull() {
        Assert.assertEquals(false, testObject5.norSingleOperation());
    }

    @Test
    void norSingleOperationWithFalseAndNull() {
        Assert.assertEquals(false, testObject6.norSingleOperation());
    }

    @Test
    void norSingleOperationWithNullAndTrue() {
        Assert.assertNull(testObject7.norSingleOperation());
    }

    @Test
    void norSingleOperationWithNullAndFalse() {
        Assert.assertNull(testObject8.norSingleOperation());
    }

    @Test
    void norSingleOperationWithNullAndNull() {
        Assert.assertNull(testObject9.norSingleOperation());
    }
}