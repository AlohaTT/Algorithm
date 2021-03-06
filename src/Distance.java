﻿/*
 * 有一篇文章内含多个单词，现给定两个单词，请设计一个高效算法，找出文中这两个
 * 单词的最短距离(即最少相隔的单词数,也就是两个单词在文章中位置的差的绝对值)。
 * 给定一个string数组article，代表所给文章，同时给定文章的单词数n和待查找的
 * 两个单词x和y。请返回两个单词的最短距离。保证两个单词均在文中出现且不相同，
 * 同时保证文章单词数小于等于1000。
 */
public class Distance {
	public int getDistance(String[] article, int n, String x, String y) {
		if (article == null || n == 0) {
			return 0;
		}

		int result = Integer.MAX_VALUE;
		int px = 0, py = 0;
		for (int i = 0; i < n; i++) {
			if (x.equals(article[i])) {
				px = i;
			}

			if (y.equals(article[i])) {
				py = i;
			}

			if (px != 0 && py != 0) { // 两个都找到了
				result = Math.min(result, Math.abs(px - py));
			}
		}

		return result;

	}

}
