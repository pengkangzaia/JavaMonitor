package com.github.onblog.client.core.order;

import com.github.onblog.client.core.cmd.ExecuteCmd;

/**
 * @author pengkangzaia@foxmail.com
 * @create 2021-10-31 15:32
 **/
public class MemUsage {

    public static String usage() {
        String memUsage = ExecuteCmd.execute(new String[]{"sh","-c","free -m | grep Mem | awk '{print $3 / $2}'"});
        return memUsage;
    }

    public static void main(String[] args) {
        String ans = usage();
        System.out.println(ans);
    }


}
