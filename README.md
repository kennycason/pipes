YPipe ypipe = new YPipe();
SingleFrictionPipe frictionPipe = new SingleFrictionPipe();
SinglePipe single = new SinglePipe();
OutputPipe out = new OutputPipe();
		
single.connect(frictionPipe);
ypipe.left(single);
ypipe.right(out);
		
frictionPipe.connect(ypipe);
start.connect(frictionPipe);
start.push(new IntegerFlow(5));

 [start]
    |
[friction]--------\
    |             |
 [ypipe]          |
    \---left---[single]
     \--right--[out]   


Output: verifies flow
pipe.pipes.SingleStartPipe@138847d
pipe.pipes.SingleFrictionPipe@1826ac5
pipe.pipes.YPipe@12fb063
pipe.pipes.SinglePipe@1e55d39
pipe.pipes.OutputPipe@14b525c
4
pipe.pipes.SingleFrictionPipe@1826ac5
pipe.pipes.YPipe@12fb063
pipe.pipes.SinglePipe@1e55d39
pipe.pipes.OutputPipe@14b525c
3
pipe.pipes.SingleFrictionPipe@1826ac5
pipe.pipes.YPipe@12fb063
pipe.pipes.SinglePipe@1e55d39
pipe.pipes.OutputPipe@14b525c
2
pipe.pipes.SingleFrictionPipe@1826ac5
pipe.pipes.YPipe@12fb063
pipe.pipes.SinglePipe@1e55d39
pipe.pipes.OutputPipe@14b525c
1
pipe.pipes.SingleFrictionPipe@1826ac5
pipe.pipes.YPipe@12fb063
pipe.pipes.SinglePipe@1e55d39
pipe.pipes.OutputPipe@14b525c
0
pipe.pipes.SingleFrictionPipe@1826ac5

