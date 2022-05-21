package item10;

public class EqualsGeneralAgreement {
    // 반사성
    // A.equals(A) == true

    // 대칭성
    // A.equals(B) == B.equals(A)
    // CaseInsensitiveString

    // 추이성
    // A.equals(B) && B.equals(C), A.equals(C)
    // Point, ColorPoint(inherit), CounterPointer, ColorPoint(comp)

    // 일관성
    // A.equals(B) == A.equals(B)

    // null 아님
    // A.equals(null) == false

}
