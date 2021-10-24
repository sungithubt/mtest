package com.edu.shortcut;
psvm+enter      生成main方法
sout+enter      输出信息
Ctrl+Y          删除光标所在行 或 删除选中的行 （必备）
Ctrl+D          复制光标所在行 或 复制选择内容，并把复制内容插入光标位置下面 （必备）
Ctrl+W          递进式选择代码块。可选中光标所在的单词或段落，连续按会在原有选中的基础上再扩展选中范围 （必备）
ctrl+alt+t      会弹出surround with：if while try等。需要先选中，不然只选中该行。
ctrl+alt+L      格式化代码
Ctrl+Shift+U    对选中的代码进行大/小写轮流转换 （必备）
Ctrl+Shift+T    对当前类生成单元测试类，如果已经存在的单元测试类则可以进行选择
alt+enter       代码修正
Alt+Insert      代码自动生成，如生成对象的 set/get 方法，构造函数，toString()等

public class Demo1 {

    public static void main(String[] args) {
        System.out.println();
        try {
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
