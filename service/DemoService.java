package org.example.ex2_session9.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoService {

    private static final Logger logger =
            LoggerFactory.getLogger(DemoService.class);

    public void applyDiscount(String userId, String code) {

        if (code.equals("VIP")) {

            // Thành công
            logger.info("Áp dụng thành công cho user: {}", userId);

        } else if (code.equals("EXPIRED")) {

            // Lỗi nghiệp vụ
            logger.warn("Mã giảm giá đã hết hạn: {}", code);

        } else {

            // Lỗi hệ thống
            logger.error("Lỗi mất kết nối DB khi check mã: {}", code);

        }

    }

}