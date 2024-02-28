package day0227.Starter;

/**
 * 메서드가 1개인 인터페이스
 */
@FunctionalInterface
interface BinaryOp {
    int apply(int left, int light);
}
