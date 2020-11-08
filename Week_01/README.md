本周作业
用 add first 或 add last 这套新的 API 改写 Deque 的代码
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("1");
        deque.addFirst("2");
        deque.addFirst("3");
        System.out.println(deque);

        String str = deque.getFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);

分析 Queue 和 Priority Queue 的源码
添加
    boolean add(E e) 和 boolean offer(E e)。
    在实现类 java.util.LinkedList中，offer也是调用的add方法，而且都是允许加入null元素的。
删除
    E remove()和E poll()
    在实现类 java.util.LinkedList中，如果队列为空，remove抛出异常，poll返回null。
查看
    E element()和E peek()
    在实现类 java.util.LinkedList中，如果队列为空，element抛出异常，peek返回null。

本周总结
1.五毒神掌
  刷题第一遍: 5分钟 读题+思考 直接看题解：注意！多题解，比较解法优劣 背诵、默写好的解法
  刷题第二遍: 马上自己写 leetcode提交 多种解法比较、体会 优化
  刷题第三遍: 过了一天后 再重复做题 不同解法的熟练程度
  刷题第四遍: 反复回来练习相同题目
  刷题第五遍: 面试前一周恢复性训练
2。学习内容
  时间复杂度和空间复杂度
  数组、链表、跳表
  栈、队列、双端队列、优先队列
  
