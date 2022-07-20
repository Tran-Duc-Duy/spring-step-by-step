package com.example.learnspring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentId;
    private String studentName;
}
/*
! lombok giúp ta không cần phải viết contructor và các getter/setter
để minh hoạ chúng ta có thể vào HomeController và chèn đoạn code sau
public String display() {
        Student student =new Student("Number 1","Tran Duc Duy");
    }
    ở đây chỉ có lỗi là chưa trả về string thôi, còn về chuyện minh họa cho việc tạo ra một student đã  thành công, sử dụng mà không cần có contructor
*/