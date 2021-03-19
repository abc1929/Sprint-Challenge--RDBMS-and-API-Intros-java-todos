package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService{


   @Autowired
   TodosRepository todosRepository;

   @Override
   public void markComplete(long todoid) {

         todosRepository.findById(todoid).get().setCompleted(true);
   }
}
