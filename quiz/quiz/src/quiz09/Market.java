package quiz09;

import javax.swing.*;

/*
 * [문제] Market 클래스 구현하기 (고정 크기 배열 버전)
 * 
 * 요구사항
 * 1) 멤버변수로 상품을 저장할 배열을 가진다.
 *    - 타입: Product[]
 *    - 고정 길이: 100
 *    - 저장된 개수를 추적하는 int 멤버변수 필요(size)
 * 
 * 2) barcode(Product product) 메서드
 *    - 매개변수로 전달된 상품의 "이름"과 "가격"을 즉시 콘솔에 출력한다.
 *      예) 상품: 거실 TV, 가격: 800000원
 *    - null 이 전달되면 "유효하지 않은 상품입니다." 를 출력하고 저장하지 않는다.
 *    - 저장 공간이 가득 찼으면 "저장 공간이 가득 찼습니다." 출력 후 저장하지 않는다.
 *    - 그 외에는 내부 배열에 순차적으로 저장한다.
 * 
 * 3) printAll() 메서드
 *    - 지금까지 저장된 모든 상품을 한 줄씩 출력한다.
 *      출력 형식: 1. 상품명 - 가격원
 *      예) 1. 컴퓨터 - 1500000원
 *    - 저장된 상품이 하나도 없으면 "저장된 상품이 없습니다." 출력
 */
public class Market {
    // [멤버변수] 스캔된 상품을 담는 고정 배열 저장소 (100칸)
    private Product[] arr = new Product[100];

    // [멤버변수] 현재 저장된 상품 개수
    private int index = 0;

    /*
     * [메서드] 바코드 스캔: 상품 정보를 출력하고 내부 배열에 저장한다.
     * - null 이면 오류 메시지만 출력하고 저장하지 않음
     */
    public void barcode(Product product) {
        if(product == null) {
            System.out.println("없는 상품입니다");
            return;
        }
        if(index >= arr.length) {
            System.out.println("상품을 넣을 공간이 없습니다");
            return;
        }
        //상품: 거실 TV, 가격: 800000원
        System.out.println("상품:" + product.getName() + ", 가격:" + product.getPrice() );
        arr[index] = product;
        index++;
    }
    /*
     * [메서드] 지금까지 저장된 모든 상품을 출력한다.
     * - 비어 있으면 안내 메시지 출력
     */
    public void printAll() {
        if(index == 0) {
            System.out.println("저장된 상품이 없습니다");
        }
        for(int i = 0; i < index; i++) {
            System.out.println( (i + 1) + "번, 상품:" +  arr[i].getName() + ", 가격:" + arr[i].getPrice() );
        }

    }


}
